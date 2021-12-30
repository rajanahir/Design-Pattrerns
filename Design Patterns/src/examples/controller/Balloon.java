package examples.controller;


public class Balloon extends ScoreAlgoBase{

	@Override
	public int calculateScore(int taps, int multiplier) {
		// TODO Auto-generated method stub
		return (taps * multiplier) - 20;
	}

}
