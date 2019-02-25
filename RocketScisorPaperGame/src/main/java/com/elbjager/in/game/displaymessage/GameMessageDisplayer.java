package com.elbjager.in.game.displaymessage;

import com.elbjager.in.game.constants.GameConstants;
import com.elbjager.in.game.constants.GameElements.GAMECHOICES;
import com.elbjager.in.game.constants.GameElements.GAMERESULT;

/**
 * Game Message which displays result. Display Statics of the game.
 * 
 * @author harshith
 *
 */
public class GameMessageDisplayer {
	/**
	 * Display Game Results
	 * 
	 * @param gameResult
	 * @param playerchoices
	 * @param computerchoices
	 */
	public static void displayGameResults(GAMERESULT gameResult,
			GAMECHOICES playerchoices, GAMECHOICES computerchoices) {
		System.out.println(GameConstants.GRAPHICEXIT);
		switch (gameResult) {

		case WIN:

			System.out.println(playerchoices + " beats " + computerchoices);
			System.out.println(GameConstants.PLAYERWON);
			break;
		case LOOSE:

			System.out.println(playerchoices + " looses to " + computerchoices);
			System.out.println(GameConstants.COMPUTERWON);
			break;
		case TIE:

			System.out.println(playerchoices + " equals " + computerchoices);
			System.out.println(GameConstants.DRAW);
			break;

		}
	}

	/**
	 * Display the statics of the game.
	 * 
	 * @param wins
	 * @param loose
	 * @param ties
	 */
	public static void displayGameStats(int wins, int loose, int ties) {

		System.out.println(GameConstants.USER_TOTAL_GAMES + (wins + loose + ties));
		System.out.println(GameConstants.USER_WON_GAMES  + wins );
		System.out.println(GameConstants.USER_LOST_GAMES  + loose );
		System.out.println(GameConstants.USER_DRAWN_GAMES  + ties );
	}
}
