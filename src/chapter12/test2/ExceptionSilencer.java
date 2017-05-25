package chapter12.test2;

public class ExceptionSilencer {
	public static void main(String[] args) {
		try{
			throw new RuntimeException();
		}finally{
			return;
		}
	}
}
