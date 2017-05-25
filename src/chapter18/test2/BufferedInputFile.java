package chapter18.test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * 从内存输入
 * @author yins
 *
 */
public class BufferedInputFile {
	public static String read(String filename) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s=in.readLine())!=null)
			sb.append(s+"\n");
		in.close();
		return sb.toString();
	}
	public static void main(String[] args) throws IOException{
		System.out.println(read("F:\\workspace\\ThinkingJava\\src\\chapter18\\test2\\BufferedInputFile.java"));
	}
}
