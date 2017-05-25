package chapter10.test6;

import chapter10.test5.Destination;

public class Parcel5 {
	public Destination destination(String s){
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo){
				label = whereTo;
			}
			@Override
			public String readLabel() {
				return label;
			}
			
		}
		return new PDestination(s);
	}
	public Destination destination(){
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo){
				label = whereTo;
			}
			@Override
			public String readLabel() {
				return label;
			}
			
		}
		return new PDestination("111");
	}
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination();
		System.out.println(d.readLabel());
	}
}
