package chapter15.test10;

public class BasicImpl implements Basic{
	private String value;
	@Override
	public void set(String val) {
		this.value = val;
	}

	@Override
	public String get() {
		return value;
	}
	
}
