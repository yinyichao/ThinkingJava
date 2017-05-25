package chapter15.test7;

public class ColoredDimenstion<T extends Dimension & HasColor> {
	T item;
	public ColoredDimenstion(T item) {
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
}
