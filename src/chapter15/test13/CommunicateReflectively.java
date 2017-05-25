package chapter15.test13;

import java.lang.reflect.Method;

public class CommunicateReflectively {
	public static void perform(Object speaker){
		Class<?> spkr = speaker.getClass();
		try{
			try{
				Method speak = spkr.getMethod("speak");
				speak.invoke(speaker);
			}catch(NoSuchMethodException e){
				System.out.println(speaker+" cannot speak");
			}
			Method sit = spkr.getMethod("sit");
			sit.invoke(speaker);
		}catch(Exception e){
			throw new RuntimeException(speaker.toString(),e);
		}
	}
}
