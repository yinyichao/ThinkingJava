package chapter10.test8;

public class Games {
	public static void playGame(GameFactory factory){
		Game s = factory.getGame();
		while(s.move());
	}
	public static void main(String[] args) {
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}
}
