package chapter15.test11;


public class SeriaoNumbered extends Decorator{
	private static long counter =1;
	private final long serialNumber = counter++;
	public SeriaoNumbered(Basic basic) {
		super(basic);
	}
	public long getSerialNumber(){
		return serialNumber;
	}
}
