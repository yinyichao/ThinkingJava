package chapter18.test6;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class UsingBuffers {
	private static void symmetricScramble(CharBuffer buffer){
		while(buffer.hasRemaining()){
			//mark()设置mark值为position的值
			buffer.mark();
			char c1 = buffer.get();
			char c2 = buffer.get();
			//reset（）设置position值为mark的值
			buffer.reset();
			buffer.put(c2).put(c1);
		}
	}
	public static void main(String[] args) {
		char[] data = "UsingBuffers".toCharArray();
		ByteBuffer bb = ByteBuffer.allocate(data.length*2);
		CharBuffer cb = bb.asCharBuffer();
		cb.put(data);
		//rewind()	把position设为0，mark设为-1，不改变limit的值
		//打印只能打印position和limit之间的值
		System.out.println(cb.rewind());
		symmetricScramble(cb);
		System.out.println(cb.rewind());
		symmetricScramble(cb);
		System.out.println(cb.rewind());
	}
}
