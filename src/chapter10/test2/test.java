package chapter10.test2;

import chapter10.test2.Parcel2.Destination;

public class test {
	public static void main(String[] args) {
		Parcel2 q = new Parcel2();
		Parcel2.Contents c = q.contents();
		Destination d = q.to("Borneo");
	}
}
