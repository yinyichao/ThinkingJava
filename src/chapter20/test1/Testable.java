package chapter20.test1;

public class Testable {
	public void execute(){
		System.out.println("Executing..");
	}
	@Test void testExecute(){
		execute();
	}
}
