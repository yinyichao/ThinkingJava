package chapter9.test6;

public class CheckersFactory implements GameFactory{

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Checkers();
	}

}
