package chapter19.test5;

import java.util.Iterator;

import chapter19.test1.Enums;

public class Mail {
	enum GeneralDelivery{
		YES,NO1,NO2,NO3,NO4,NO5
	}
	enum Scannability{
		UNSCANNABLE,YES1,YES2,YES3,YES4
	}
	enum Readability{
		ILLEGIBLE,YES1,YES2,YES3,YES4
	}
	enum Address{
		INCORRECT,OK1,OK2,OK3,OK4,OK5,OK6
	}
	enum ReturnAddress{
		MISSING,OK1,OK2,OK3,OK4,OK5
	}
	GeneralDelivery generalDelivery;
	Scannability scannability;
	Readability readability;
	Address address;
	ReturnAddress returnAddress;
	static long counter = 0;
	long id = counter++;
	public String toString(){
		return "Mail "+id;
	}
	public String details(){
		return toString()+
				", General Delivery: "+generalDelivery+
				", Address Scannability: "+scannability+
				", Address Readability: "+readability+
				", Address Address: "+address+
				", Return Address: "+returnAddress;
	}
	public static Mail randomMail(){
		Mail m = new Mail();
		m.generalDelivery = Enums.random(GeneralDelivery.class);
		m.scannability = Enums.random(Scannability.class);
		m.readability = Enums.random(Readability.class);
		m.address = Enums.random(Address.class);
		m.returnAddress = Enums.random(ReturnAddress.class);
		return m;
	}
	public static Iterable<Mail> generator(final int count){
		return new Iterable<Mail>(){
			int n = count;
			public Iterator<Mail> iterator(){
				return new Iterator<Mail>(){
					public boolean hasNext(){
						return n-->0;
					}
					public void remove(){
						throw new UnsupportedOperationException();
					}
					@Override
					public Mail next() {
						return randomMail();
					}
				};
			}
		};
	}
}
