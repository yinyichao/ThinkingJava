package chapter20.test4;

import org.junit.Test;

import chapter18.test4.OSExecute;

public class AtUnitExample1 {
	public String methodOne(){
		return "This is methodOne";
	}
	public int methodTwo(){
		System.out.println("This is methodTwo");
		return 2;
	}
	@Test boolean methodOneTest(){
		return methodOne().equals("This is methodOne");
	}
	@Test boolean m2(){
		return methodTwo()==2;
	}
	@Test private boolean m3(){
		return true;
	}
	@Test boolean failureTest(){
		return false;
	}
	@Test boolean anotherDisappointment(){
		return false;
	}
	public static void main(String[] args)throws Exception {
		OSExecute.command("java chapter20.test4.AtUnitExample1");
	}
}
