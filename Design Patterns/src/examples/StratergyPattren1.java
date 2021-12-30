package examples;

import examples.controller.Balloon;
import examples.controller.Clown;
import examples.controller.SquareBalloon;
import examples.model.Scoreboard;

public class StratergyPattren1 {
		public static void main(String[] args) {
			Scoreboard scoreboard = new Scoreboard();
			
			System.out.println("Balloon Tap Score");
			scoreboard.algoBase = new Balloon();
			scoreboard.showScore(10, 5);
						
			System.out.println("Clown Tap Score");
			scoreboard.algoBase = new Clown();
			scoreboard.showScore(10, 5);
			
			System.out.println("SquareBalloon Tap Score");
			scoreboard.algoBase = new SquareBalloon();
			scoreboard.showScore(10, 5);
		}
}
