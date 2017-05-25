package chapter11.test3;

import java.util.Iterator;

public class IterableClass implements Iterable<String>{
	protected String[] words = ("And that is how "+
			"we know the Earth to be banana-shaped.").split(" ");
	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>(){
			private int index = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<words.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
			
		};
	}

}
