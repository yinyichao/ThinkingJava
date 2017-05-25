package chapter7.test1;

public class WaterSource {
	private String s;
	public WaterSource(){
		System.out.println("WaterSource()");
		s="Constructed";
	}
	public String toString(){
		return s;
	}
}
