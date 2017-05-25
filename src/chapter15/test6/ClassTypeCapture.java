package chapter15.test6;

import chapter9.test1.C;


public class ClassTypeCapture<T> {
	T x;
	
	Class<T> kind;

	public ClassTypeCapture(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//this.kind = kind;
	}
	public boolean f(Object arg){
		return kind.isInstance(arg);
	}
	public static void main(String[] args) {
		ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<Building>(Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
	}
}
