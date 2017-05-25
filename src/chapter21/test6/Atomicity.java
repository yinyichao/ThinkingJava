package chapter21.test6;

public class Atomicity {
	int i;
	void f1(){
		i++;
	}
	void f2(){
		i+=3;
	}
}
