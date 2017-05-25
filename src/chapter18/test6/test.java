package chapter18.test6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class test {
	public static void main(String[] args)throws Exception {
		FileChannel fc1 = new FileOutputStream("data.txt").getChannel();
		ByteBuffer bb1 = ByteBuffer.allocate(1024);
		bb1.putDouble(1.11);
		bb1.flip();
		fc1.write(bb1);
		fc1.close();
		FileInputStream fis = new FileInputStream("data.txt");
		FileChannel fc2 = fis.getChannel();
		ByteBuffer bb2 = ByteBuffer.allocate(1024);
		fc2.read(bb2);
		bb2.flip();
		System.out.println(bb2.getDouble());
	}
}
