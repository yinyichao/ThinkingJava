package chapter19.test6;
import static chapter19.test6.Outcome.DRAW;
import static chapter19.test6.Outcome.LOSE;
import static chapter19.test6.Outcome.WIN;
public enum RoShamBo2 implements Competitor<RoShamBo2>{
	PAPER(DRAW,LOSE,WIN),
	SCISSORS(WIN,DRAW,LOSE),
	ROCK(LOSE,WIN,DRAW);
	private Outcome vPAPER,vSCISSORS,vROCK;
	RoShamBo2(Outcome paper,Outcome scissors,Outcome rock){
		this.vPAPER = paper;
		this.vSCISSORS = scissors;
		this.vROCK = rock;
	}
	@Override
	public Outcome compete(RoShamBo2 it) {
		switch (it) {
		default:
		case PAPER:return vPAPER;
		case SCISSORS:return vSCISSORS;
		case ROCK:return vROCK;
		}
	}
	public static void main(String[] args) {
		RoShamBo.play(RoShamBo2.class, 20);
	}
}
