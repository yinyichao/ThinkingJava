package chapter15.test16;

import java.util.Collection;

public class Adapter {
	public static<T> Addable<T> collectionAdapter(Collection<T> c){
		return new AddableCollectionAdpter<T>(c);
	}
}
