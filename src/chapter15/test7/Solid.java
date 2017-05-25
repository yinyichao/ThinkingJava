package chapter15.test7;

public class Solid<T extends Dimension & HasColor & Weight> {
	T item;

	public Solid(T item) {
		this.item = item;
	}
	T getItem(){
		return item;
	}
	java.awt.Color color(){
		return item.getColor();
	}
	int getX(){
		return item.x;
	}
	int getY(){
		return item.y;
	}
	int getZ(){
		return item.z;
	}
	int weight(){
		return item.weight();
	}
}
