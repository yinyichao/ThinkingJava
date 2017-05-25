package chapter18.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
/**
 * 文本文件输出的快捷方式
 * @author yins
 *
 */
//F:\\workspace\\ThinkingJava\\src\\chapter18\\test2\\BufferedInputFile.java
public class FileOutputShortcut {
	static String file = "FileOutputShortcut.out";
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("F:\\workspace\\ThinkingJava\\src\\chapter18\\test2\\FileOutputShortcut.java")));
		PrintWriter out = new PrintWriter(file);
		int lineCount = 1;
		String s;
		while((s=in.readLine())!=null)
			out.println(lineCount++ +":" +s);
		out.close();
		System.out.println(BufferedInputFile.read(file));
		System.out.println(file);
	}
}
