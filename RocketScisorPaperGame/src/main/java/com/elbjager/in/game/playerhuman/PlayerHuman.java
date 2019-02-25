package com.elbjager.in.game.playerhuman;

import java.util.Scanner;

import com.elbjager.in.game.choice.selector.PlayerChoiceSelector;
import com.elbjager.in.game.constants.GameConstants;
import com.elbjager.in.game.constants.GameElements;

/**
 * Player Human which reads on the values by entered by the user.
 * 
 * @author harshith
 *
 */
public class PlayerHuman extends GameElements implements PlayerChoiceSelector {

	Scanner userInputScanner;

	public PlayerHuman() {
		super();
		userInputScanner = new Scanner(System.in);
	}

	/**
	 * Get Player values and match to game choice
	 */
	public GAMECHOICES getPlayerChoice() {
		try {

			System.out.println(GameConstants.GAMEINPUTS);
			System.out.println(GameConstants.GAMEENTERFIELD);
			char playerChoice = userInputScanner.nextLine().toUpperCase()
					.charAt(0);
			switch (playerChoice) {
			case 'R':
				return GAMECHOICES.ROCK;
			case 'P':
				return GAMECHOICES.PAPER;
			case 'S':
				return GAMECHOICES.SCISSOR;
			}
			System.out.println("Invalid input");
			return getPlayerChoice();
		} catch (Exception exception) {
			System.out.println(GameConstants.GAMEWRONGINPUT);
			return getPlayerChoice();
		}

	}

}
