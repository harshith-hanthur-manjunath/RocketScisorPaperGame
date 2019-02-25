package com.elbjager.in.game.playercomputer;

import java.util.Random;

import com.elbjager.in.game.choice.selector.PlayerChoiceSelector;
import com.elbjager.in.game.constants.GameElements;

/**
 * Computer plays the game. Select the random values for computer.
 * 
 * @author harshith
 *
 */
public class PlayerComputer extends GameElements implements
		PlayerChoiceSelector {
	private static final int OFFSETSELECTION = 1;
	private static final int MAXOPTIONSSELECTION = 3;

	private Random randomSelector;

	public PlayerComputer() {
		super();
		randomSelector = new Random();
	}

	/**
	 * Get the Computer selected values.
	 */
	public GAMECHOICES getPlayerChoice() {
		int computerchoice = getRandomChoice();
		switch (computerchoice) {
		case 1:
			return GAMECHOICES.ROCK;
		case 2:
			return GAMECHOICES.SCISSOR;

		default:
			return GAMECHOICES.PAPER;
		}

	}

	/**
	 * Generate Random value between 1 to 3
	 * 
	 * @return
	 */
	private int getRandomChoice() {
		int computerchoice = OFFSETSELECTION
				+ randomSelector.nextInt(MAXOPTIONSSELECTION);
		return computerchoice;
	}
}
