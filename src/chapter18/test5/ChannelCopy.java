package chapter18.test5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class ChannelCopy {
	private static final int BSIZE = 1024;
	public static void main(String[] args)throws Exception {
		if(args.length !=2){
			System.out.println("arguments:sourcefile destfile");
			System.exit(1);
		}
		FileChannel in = new FileInputStream(args[0]).getChannel();
		FileChannel out = new FileOutputStream(args[1]).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		//当FIleChannel.read()返回-1时，输入到达末尾
		while(in.read(buffer)!=-1){
			//每次read（）操作之后，就会将数据输入到缓冲器中，flip（）则是准备缓冲器以便它的信息可以由write（）提取
			buffer.flip();
			out.write(buffer);
			//write（）操作之后，信息仍在缓冲器中，接着clear（）操作则对所有的内部指针重新安排，以便缓冲器在另一个read（）操作期间做好接收数据的准备
			buffer.clear();
		}
	}
}
