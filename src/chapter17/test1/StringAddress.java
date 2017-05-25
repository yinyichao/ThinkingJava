package chapter17.test1;

public class StringAddress {
	private String s;
	public StringAddress(String s){
		this.s = s;
	}
	public String toString(){
		return super.toString()+" "+s;
	}
}
