package chapter15.test7;

public class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T> {
	Solid2(T item){
		super(item);
	}
	int weight(){
		return item.weight();
	}
}
