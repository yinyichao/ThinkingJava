package chapter9.test6;

public class Checkers implements Game{
	private int moves =0;
	private static final int MOVES = 3;
	@Override
	public boolean move() {
		System.out.println("Checkers move"+moves);
		return ++moves!=MOVES;
	}

}
