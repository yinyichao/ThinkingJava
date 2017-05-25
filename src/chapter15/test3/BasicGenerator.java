package chapter15.test3;

public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;
	
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}

	@Override
	public T next() {
		try{
			return type.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		//return (T) new BasicGenerator<T>(type);
	}
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}
}
