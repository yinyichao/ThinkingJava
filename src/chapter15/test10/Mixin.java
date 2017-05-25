package chapter15.test10;

public class Mixin extends BasicImpl implements TimeStamped,SerialNumbered{
	private TimeStamped timeStamp = new TimeStampedImp();
	private SerialNumbered serialNumber = new SerialNumberedImp();
	public long getStamp(){
		return timeStamp.getStamp();
	}
	public long getSerialNumber(){
		return serialNumber.getSerialNumber();
	}
}
