package chapter18.test2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {
	public static void main(String[] args)throws IOException {
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("F:\\workspace\\ThinkingJava\\src\\chapter18\\test2\\TestEOF.java")));
		while(in.available()!=0){
			System.out.println(in.readByte());
		}
	}
}
