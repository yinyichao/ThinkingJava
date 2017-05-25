package chapter10.test8;

public class Implementation2 implements Service{
//ALT+SHIFT+S 弹出快捷菜单按“V”键选择要实现的方法。
//Ctrl+shift+s+c  无参构造
//Ctrl+shift+s+o  有参构造
	private Implementation2() {
	}
	
	@Override
	public void method1() {
		System.out.println("Implementation2 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation2 method1");
	}
	public static ServiceFactory factory = new ServiceFactory(){
		public Service getService(){
			return new Implementation2();
		}
	};
}
