package chapter10.test5;

public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		System.out.println(d.readLabel());
		System.out.println(c.value());
		//Parcel4.PContents pp = p.new PContents();
		//Parcel4.PDestination pp = p.new PDestination("1");
	}
}
