package chapter9.test6;

public class ChessFactory implements GameFactory{

	@Override
	public Game getGame() {
		return new Chess();
	}

}
