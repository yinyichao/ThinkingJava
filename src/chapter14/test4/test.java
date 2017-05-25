package chapter14.test4;

import chapter14.test5.A;
import chapter14.test5.HiddenC;

public class test {
	public static void main(String[] args) {
		A a = HiddenC.makeA();
		a.f();
	}
}
