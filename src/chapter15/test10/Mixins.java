package chapter15.test10;

public class Mixins {
	public static void main(String[] args) {
		Mixin mixin1 = new Mixin(),mixin2 = new Mixin();
		mixin1.set("test string 1");
		mixin2.set("test string 2");
		System.out.println(mixin1.get()+" "+mixin1.getStamp()+" "+mixin1.getSerialNumber());
		System.out.println(mixin2.get()+" "+mixin2.getStamp()+" "+mixin2.getSerialNumber());
	}
}
