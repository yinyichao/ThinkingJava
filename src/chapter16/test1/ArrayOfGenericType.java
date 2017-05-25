package chapter16.test1;

public class ArrayOfGenericType<T> {
	T[] array;
	public ArrayOfGenericType(int size){
		//Cannot create a generic array of T
		//array = new T[size];
		array = (T[]) new Object[size];
	}
	public <U> U[] makeArray(){
		return (U[]) new Object[10];
	}
}
