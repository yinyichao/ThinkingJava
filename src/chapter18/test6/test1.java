package chapter18.test6;

import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

public class test1 {
	public static void main(String args[]) throws FileNotFoundException {

		System.out.println("----------Test allocate--------");
		System.out.println("before alocate:"
				+ Runtime.getRuntime().freeMemory());
		
		// 如果分配的内存过小，调用Runtime.getRuntime().freeMemory()大小不会变化？
		// 要超过多少内存大小JVM才能感觉到？
		//1024b=1k
		ByteBuffer buffer = ByteBuffer.allocate(102400);
		System.out.println("buffer = " + buffer);
		
		System.out.println("after alocate:"
				+ Runtime.getRuntime().freeMemory());
		
		// 这部分直接用的系统内存，所以对JVM的内存没有影响
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(102400);
		System.out.println("directBuffer = " + directBuffer);
		System.out.println("after direct alocate:"
				+ Runtime.getRuntime().freeMemory());
		
		System.out.println("----------Test wrap--------");
		byte[] bytes = new byte[32];
		buffer = ByteBuffer.wrap(bytes);
		System.out.println(buffer);
		
		buffer = ByteBuffer.wrap(bytes, 10, 10);
		System.out.println(buffer);	
		ByteBuffer bBuf = ByteBuffer.allocate(512);
        bBuf.putInt(1);
        bBuf.putInt(2);
        bBuf.putInt(3);
        bBuf.putInt(4);
        bBuf.putInt(5);
        bBuf.putInt(6);
        bBuf.putInt(7);
        bBuf.flip();
        bBuf.putInt(8);
        bBuf.putInt(9);
        //从上面的输出发现当flip（）被调用之后如果在网buffer里面put数据会覆盖之前写入的数据，导致Position位置后移，如果在加一句get（）就会出现java.nio.BufferUnderflowException异常，见下面的输出。
        System.out.println("缓冲区Pos：" + bBuf.position() + "  缓冲区Limit："
                + bBuf.limit());
        System.out.println(bBuf.getInt());
        System.out.println(bBuf.getInt());
        System.out.println(bBuf.getInt());
        System.out.println(bBuf.getInt());
        System.out.println(bBuf.getInt());
        //System.out.println(bBuf.getInt());
	}
}
