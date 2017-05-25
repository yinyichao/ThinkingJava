package chapter15.test13;


public class LatentReflection {
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		//CommunicateReflectively.perform(new Robot());
		CommunicateReflectively.perform(new Mime());
	}
}
