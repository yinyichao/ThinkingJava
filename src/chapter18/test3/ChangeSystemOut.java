package chapter18.test3;

import java.io.PrintWriter;

/**
 * 将System.out转换成PrintWriter
 * @author yins
 *
 */
public class ChangeSystemOut {
	public static void main(String[] args) {
		//true 开始自动flush ，否则可能看不到输出
		PrintWriter out = new PrintWriter(System.out,true);
		out.println("Hello world");
	}
}
