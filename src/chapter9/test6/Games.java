package chapter9.test6;

public class Games {
	public static void playGame(GameFactory f){
		Game g = f.getGame();
		while(g.move());
	}
	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
}
