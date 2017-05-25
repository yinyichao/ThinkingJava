package chapter20.test4;

import org.junit.Test;

import chapter18.test4.OSExecute;

public class AtUnitExample2 {
	public String methodOne(){
		return "This is methodOne";
	}
	public int methodTwo(){
		System.out.println("This is methodTwo");
		return 2;
	}
	@Test void assertExample(){
		assert methodOne().equals("This is methodOne");
	}
	@Test void assertFailureExample(){
		assert 1 == 2: "What a surprise!";
	}
	@Test boolean assertAndReturn(){
		assert methodTwo() == 2 :"methodTwo must equal 2";
		return methodOne().equals("This is methodOne");
	}
	public static void main(String[] args)throws Exception {
		OSExecute.command("java chapter20.test4.AtUnitExample2");
	}
}
