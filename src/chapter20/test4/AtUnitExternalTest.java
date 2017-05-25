package chapter20.test4;

import org.junit.Test;

import chapter18.test4.OSExecute;

public class AtUnitExternalTest extends AtUnitExample1{
	@Test boolean _methodOne(){
		return methodOne().equals("This is methodOne");
	}
	@Test boolean _methodTwo(){
		return methodTwo()==2;
	}
	public static void main(String[] args)throws Exception {
		OSExecute.command("java chapter20.test4.AtUnitExternalTest");
	}
}
