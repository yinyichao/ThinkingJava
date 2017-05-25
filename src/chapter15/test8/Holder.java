package chapter15.test8;

public class Holder<T> {
	private T value;
	public Holder(){
		
	}
	public Holder(T val){
		value = val;
	}
	public void set(T val){
		value = val;
	}
	public T get(){
		return value;
	}
	public boolean equals(Object obj){
		return value.equals(obj);
	}
	public static void main(String[] args) {
		Holder<Apple> apple = new Holder<Apple>(new Apple());
		Apple d = apple.get();
		apple.set(d);
		//Type mismatch: cannot convert from Holder<Apple> to Holder<Fruit>
		//Holder<Fruit> fruit = apple;
		Holder<? extends Fruit> fruit = apple;
		Fruit p = fruit.get();
		d = (Apple) fruit.get();
		try{
			Orange c = (Orange) fruit.get();
		}catch(Exception e){
			e.printStackTrace();
		}
		//The method set(capture#3-of ? extends Fruit) in the type Holder<capture#3-of ? extends 
		//Fruit> is not applicable for the arguments (Apple)
		//fruit.set(new Apple());
		System.out.println(fruit.equals(d));
	}
}
