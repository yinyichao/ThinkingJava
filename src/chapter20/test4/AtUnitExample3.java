package chapter20.test4;

public class AtUnitExample3 {
	private int n;

	public AtUnitExample3(int n) {
		this.n = n;
	}
	public int getN(){
		return n;
	}
	public String methodOne(){
		return "This is methodOne";
	}
	public int methodTwo(){
		System.out.println("This is methodTwo");
		return 2;
	}
	@TestObjectCreate static AtUnitExample3 create(){
		return new AtUnitExample3(47);
	}
}
