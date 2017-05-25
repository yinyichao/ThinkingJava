package chapter19.test5;

import chapter15.test3.Generator;

public class RandomInputGenerator implements Generator<Input>{

	@Override
	public Input next() {
		return Input.randomSelection();
	}
}
