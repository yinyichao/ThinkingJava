package chapter18.test6;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class LockingMappedFiles {
	static final int LENGTH = 0x8FFFFFF;//128m
	static FileChannel fc;
	public static void main(String[] args)throws Exception {
		fc = new RandomAccessFile("test.dat","rw").getChannel();
		MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE, 0, LENGTH);
		for (int i = 0; i < LENGTH; i++) {
			out.put((byte) 'x');
		}
		new LockAndModify(out,0,0+LENGTH/3);
		new LockAndModify(out,LENGTH/2,LENGTH/2+LENGTH/4);
	}
	private static class LockAndModify extends Thread{
		private ByteBuffer buff;
		private int start,end;
		public LockAndModify(ByteBuffer mbb, int start, int end) {
			this.start = start;
			this.end = end;
			mbb.limit(end);
			mbb.position(start);
			//slice()方法用于创建一个共享了原始缓冲区子序列的新缓冲区。
			//新缓冲区的position值是0，而其limit和capacity的值都等于原始缓冲区的limit和position的差值。
			//slice()方法将新缓冲区数组的offset值设置为原始缓冲区的position值，然而，
			//在新缓冲区上调用array()方法还是会返回整个数组。
			this.buff = mbb.slice();
			start();
		}
		public void run(){
			try{
				FileLock fl = fc.lock(start,end,false);
				System.out.println("Locked: "+start+" to"+end);
				while(buff.position()<buff.limit()-1){
					buff.put((byte) (buff.get()+1));
				}
				fl.release();
				System.out.println("Released: "+start+" to "+end);
			}catch(IOException e){
				throw new RuntimeException(e);
			}
		}
	}
}
