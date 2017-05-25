package chapter15.test7;

import java.awt.Color;

public class Bounded extends Dimension implements HasColor,Weight{

	@Override
	public int weight() {
		return 0;
	}

	@Override
	public Color getColor() {
		return null;
	}
	
}
