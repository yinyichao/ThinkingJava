package chapter15.test16;

import java.util.Collection;

public class AddableCollectionAdpter<T> implements Addable<T>{
	private Collection<T> c;
	
	public AddableCollectionAdpter(Collection<T> c) {
		this.c = c;
	}

	@Override
	public void add(T t) {
		c.add(t);
	}
	
}
