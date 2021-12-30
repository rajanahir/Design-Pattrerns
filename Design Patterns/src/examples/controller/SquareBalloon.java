package examples.controller;

public class SquareBalloon extends ScoreAlgoBase{

	@Override
	public int calculateScore(int taps, int multiplier) {
		// TODO Auto-generated method stub
		return ( taps * multiplier ) + 40;
	}

}
