package chapter18.test5;

import java.nio.ByteBuffer;

/**
 * 获取基本类型
 * 尽管ByteBuffer只能保存字节类型的数据，但是他具有
 * 可以从其所容纳的字节中产生出各种不同基本类型值的方法。
 * 
 * 向ByteBuffer插入基本类型数据的最简单的方法是：
 * 利用asCharBuffer（）、asShortBuffer（）等获得该缓冲器上的视图
 * 然后使用视图的put（）方法。
 * @author yins
 *
 */
public class GetData {
	private static final int BSIZE = 1024;
	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		int i = 0;
		while(i++<bb.limit())
			if(bb.get()!=0)
				System.out.println("nonzero");
		System.out.println("i="+i);
		bb.rewind();
		bb.asCharBuffer().put("Howdy!");
		char c;
		while((c = bb.getChar())!= 0)
			System.out.print(c+" ");
		System.out.println();
		bb.rewind();
		bb.asShortBuffer().put((short)471142);
		System.out.println(bb.getShort());
		bb.rewind();
		bb.asIntBuffer().put(99471142);
		System.out.println(bb.getInt());
		bb.rewind();
		bb.asLongBuffer().put(99471142);
		System.out.println(bb.getLong());
		bb.rewind();
		bb.asFloatBuffer().put(99471142);
		System.out.println(bb.getFloat());
		bb.rewind();
		bb.asDoubleBuffer().put(99471142);
		System.out.println(bb.getDouble());
		bb.rewind();
	}
}
