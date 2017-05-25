package chapter14.test4;

public class SimeProxy implements Interface{
	private Interface proxied;
	public SimeProxy(Interface proxied) {
		this.proxied = proxied;
	}

	@Override
	public void doSomething() {
		System.out.println("SimpleProxy doSomething");
		proxied.doSomething();
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("SimpleProxy somethingElse"+arg);
		proxied.somethingElse(arg);
	}

}
