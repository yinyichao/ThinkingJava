package chapter15.test7;

public class Colored<T extends HasColor> {
	T item;
	Colored(T item){
		this.item = item;
	}
	T getItem(){
		return item;
	}
	java.awt.Color color(){
		return item.getColor();
	}
}
