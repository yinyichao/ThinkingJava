package chapter19.test6;

public enum RoShamBo4 implements Competitor<RoShamBo4>{
	ROCK{
		@Override
		public Outcome compete(RoShamBo4 opponent) {
			return compete(SCISSORS,opponent);
		}
	},
	SCISSORS{
		@Override
		public Outcome compete(RoShamBo4 opponent) {
			return compete(PAPER,opponent);
		}
	},
	PAPER{
		@Override
		public Outcome compete(RoShamBo4 opponent) {
			return compete(ROCK,opponent);
		}
	};

	public Outcome compete(RoShamBo4 loser,RoShamBo4 opponent) {
		return ((opponent == this)?Outcome.DRAW :((opponent == loser)?Outcome.WIN:Outcome.LOSE));
	}
	
}
