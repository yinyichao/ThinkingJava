package chapter9.test5;

public class Implementation1Factory implements ServiceFactory{

	@Override
	public Service getService() {
		return new Implementation1();
	}

}
