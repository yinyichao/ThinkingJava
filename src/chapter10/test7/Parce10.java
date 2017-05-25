package chapter10.test7;

import chapter10.test5.Destination;

public class Parce10 {
	public Destination
	destination(final String dest,final Float price){
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost>100)
					System.out.println("Over budget!");
			}
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parce10 p = new Parce10();
		Destination d = p.destination("Tasmania", 101.395F);
	}
}
