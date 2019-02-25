package com.elbjager.in.game.executor;

import java.util.Scanner;
import com.elbjager.in.game.constants.GameConstants;
import com.elbjager.in.game.constants.GameElements;
import com.elbjager.in.game.displaymessage.GameMessageDisplayer;
import com.elbjager.in.game.playercomputer.PlayerComputer;
import com.elbjager.in.game.playerhuman.PlayerHuman;

/**
 * 
 * @author harshith Game Executor which executes manual and computer mode.
 */
public class GameExecutor extends GameElements {
	private PlayerHuman playerHuman;
	private PlayerComputer playerComputer;
	private GAMECHOICES playerchoices, computerchoices;
	private GAMERESULT gameResult;
	private static int wins, loose, ties;
	Scanner scanner = new Scanner(System.in);

	public GameExecutor() {
		super();
		playerHuman = new PlayerHuman();
		playerComputer = new PlayerComputer();
	}

	/**
	 * Begin Game with Reading the values user input. close the scanner if user
	 * needs to exit.
	 */
	public static boolean beginGame() {
		boolean isGameStarted = false;
		try {
			Scanner scanner = new Scanner(System.in);
			GameExecutor gameExecutor = new GameExecutor();
			char userValue = ' ';
			while (userValue != GameConstants.USER_ENDGAME) {
				gameExecutor.playGame();
				System.out.println(GameConstants.GRAPHICENTRY);
				System.out.println(GameConstants.GAMEAGAIN);
				System.out.println(GameConstants.GAMEQUIT);
				userValue = scanner.nextLine().toUpperCase().charAt(0);
				isGameStarted = true;
			}
			scanner.close();
			return isGameStarted;
		} catch (StringIndexOutOfBoundsException e) {
			isGameStarted = false;
			beginGame();
		}
		return isGameStarted;
	}

	/**
	 * Get the Players Choices. Get the Computer Choices. Compare the values.
	 * Display the values.
	 */
	private void playGame() {
		playerchoices = playerHuman.getPlayerChoice();
		computerchoices = playerComputer.getPlayerChoice();
		gameResult = getResult();
		GameMessageDisplayer.displayGameResults(gameResult, playerchoices,
				computerchoices);
		getGameStats();
		GameMessageDisplayer.displayGameStats(wins, loose, ties);
	}

	/**
	 * Get the game result by comparing both the values.
	 * 
	 * @return GAMERESULT
	 */
	private GAMERESULT getResult() {
		if (playerchoices == computerchoices) {
			return GAMERESULT.TIE;
		}
		switch (playerchoices) {
		case ROCK:

			return (computerchoices == GAMECHOICES.SCISSOR ? GAMERESULT.WIN
					: GAMERESULT.LOOSE);
		case PAPER:

			return (computerchoices == GAMECHOICES.ROCK ? GAMERESULT.WIN
					: GAMERESULT.LOOSE);
		case SCISSOR:

			return (computerchoices == GAMECHOICES.PAPER ? GAMERESULT.WIN
					: GAMERESULT.LOOSE);

		}
		return GAMERESULT.LOOSE;
	}

	/**
	 * Get the gamestats.
	 */
	private void getGameStats() {
		if (gameResult == GAMERESULT.WIN) {
			wins++;
		} else if (gameResult == GAMERESULT.LOOSE) {
			loose++;
		} else {
			ties++;
		}
	}

}