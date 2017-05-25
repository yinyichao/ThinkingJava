package chapter10.test7;

import chapter10.test5.Contents;

public class Parcel7 {
	public Contents contents(){
		//匿名内部类
		//创建一个继承自Contents的匿名类的对象
		//通过new表达式返回的引用被自动向上转型为对Contents的引用
		return new Contents(){
			private int i = 11;
			@Override
			public int value() {
				return i;
			}
		};
	}
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}
}
