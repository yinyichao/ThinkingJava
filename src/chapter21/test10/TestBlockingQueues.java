package chapter21.test10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestBlockingQueues {
	static void getKey(){
		try{
			new BufferedReader(new InputStreamReader(System.in)).readLine();
		}catch(java.io.IOException e){
			throw new RuntimeException(e);
		}
	}
	static void getKey(String message){
		System.out.println(message);
		getKey();
	}
}
