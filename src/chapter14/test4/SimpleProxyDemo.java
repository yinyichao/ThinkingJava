package chapter14.test4;

public class SimpleProxyDemo {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimeProxy(new RealObject()));
	}
}
