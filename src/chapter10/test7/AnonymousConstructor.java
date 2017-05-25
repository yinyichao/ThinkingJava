package chapter10.test7;

public class AnonymousConstructor {
	public static Base getBase(int i){
		return new Base(i){
			{
				System.out.println("Inside instance initializer");
			}
			@Override
			public void f() {
				System.out.println("In anonymous f()");
			}
		};
	}
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}
