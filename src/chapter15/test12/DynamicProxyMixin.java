package chapter15.test12;

import chapter15.test1.TwoTuple;
import chapter15.test10.Basic;
import chapter15.test10.BasicImpl;
import chapter15.test10.SerialNumbered;
import chapter15.test10.SerialNumberedImp;
import chapter15.test10.TimeStamped;
import chapter15.test10.TimeStampedImp;

public class DynamicProxyMixin {
	public static TwoTuple tuple(Object o1,Class c1){
		TwoTuple t = new TwoTuple(o1,c1);
		return t;
	}
	public static void main(String[] args) {
		Object mixin = MixinProxy.newInstance(
				tuple(new BasicImpl(),Basic.class),
				tuple(new TimeStampedImp(),TimeStamped.class),
				tuple(new SerialNumberedImp(),SerialNumbered.class));
		Basic b = (Basic) mixin;
		TimeStamped t = (TimeStamped) mixin;
		SerialNumbered s = (SerialNumbered) mixin;
		b.set("Hello");
		System.out.println(b.get());
		System.out.println(t.getStamp());
		System.out.println(s.getSerialNumber());
	}
}
