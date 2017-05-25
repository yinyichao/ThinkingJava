package chapter19.test1;

import java.util.Random;

import chapter15.test3.Generator;

enum CartoonCharacter implements Generator<CartoonCharacter>{
	SLAPPY,SPANKY,PUNCHY,SILLY,BOUNCY,NUTTY,BOB;
	private Random rand = new Random(47);
	@Override
	public CartoonCharacter next() {
		return values()[rand.nextInt(values().length)];
	}
	
}
public class EnumImplementation {
	public static <T> void printNext(Generator<T> rg){
		System.out.print(rg.next()+",");
	}
	public static void main(String[] args) {
		CartoonCharacter cc = CartoonCharacter.BOB;
		for (int i = 0; i < 10; i++) {
			System.out.println(cc.next());
		}
	}
}
