package examples.model;

import examples.controller.ScoreAlgoBase;

public class Scoreboard {
	public ScoreAlgoBase algoBase;
	
	public void showScore( int taps, int multiplier ) {
		System.out.println(algoBase.calculateScore(taps, multiplier));
	}
}
