package chapter15.test7;

public class HoldItem<T> {
	T item;
	HoldItem(T item){
		this.item = item;
	}
	T getItem(){
		return item;
	}
}
