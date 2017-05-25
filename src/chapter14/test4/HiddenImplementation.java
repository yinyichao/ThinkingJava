package chapter14.test4;

import java.lang.reflect.Method;

import chapter14.test5.A;
import chapter14.test5.HiddenC;

public class HiddenImplementation {
	public static void main(String[] args) throws Exception{
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		/*if(a instanceof C){
			C c = (C) a;
			c.g();
		}*/
		callHiddenMethod(a, "g");
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
	}
	static void callHiddenMethod(Object a,String methodName) throws Exception{
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}
}
