package chapter18.test2;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * 格式化的内存输入
 * @author yins
 *
 */
public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException{
		try{
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("F:\\workspace\\ThinkingJava\\src\\chapter18\\test2\\FormattedMemoryInput.java").getBytes()));
			while(true)
				System.out.print((char)in.readByte());
		}catch(EOFException e){
			System.err.println("End of stream");
		}
	}
}
