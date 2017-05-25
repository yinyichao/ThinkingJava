package chapter7.test2;

public class Bath {
	private String
	s1 = "Happy",
	s2 = "Happy",
	s3,s4;
	private Soap castille;
	private int i;
	private float toy;
	public Bath(){
		System.out.println("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	{
		i = 47;
	}
	public String toString(){
		if(s4 == null){
			s4 = "Joy";
		}
		return "";
	}
	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);
	}
}
