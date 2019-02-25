package com.elbjager.in.game.playertest;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.elbjager.in.game.playercomputer.PlayerComputer;
import com.elbjager.in.game.playerhuman.PlayerHuman;

public class PlayerTest {

	   PlayerHuman playerHuman;
    @Before	
    public void createPlayerHuman() 
    { 
    	playerHuman=new PlayerHuman();
    }
  
	@After public void closePlayerHuman() 
    {
   //logic for closing resource
    } 
	 @Test
	    public void getPlayerSelectionPaper() {
	       Assert.assertEquals(playerHuman.getPlayerChoice().PAPER.name(), "PAPER");
	    }
	 @Test
	    public void getPlayerSelectionRock() {
	       Assert.assertEquals(playerHuman.getPlayerChoice().ROCK.name(), "ROCK");
	    }
	 @Test
	    public void getPlayerSelectionScisors() {
	       Assert.assertEquals(playerHuman.getPlayerChoice().SCISSOR.name(), "SCISSOR");
	    }
}
