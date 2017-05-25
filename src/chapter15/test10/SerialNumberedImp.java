package chapter15.test10;

public class SerialNumberedImp implements SerialNumbered{
	private static long counter = 1;
	private final long serialNumber = counter++;
	@Override
	public long getSerialNumber() {
		return serialNumber;
	}
	
}
