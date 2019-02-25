package com.elbjager.in.game.playertest;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.elbjager.in.game.playercomputer.PlayerComputer;

public class ComputerTest {

	   PlayerComputer playerComputer;
    @Before	
    public void createPlayerComputer() 
    { 
    	playerComputer=new PlayerComputer();
    }
  
	@After public void closePlayerComputer() 
    {
   //logic for closing resource
    } 
	 @Test
	    public void getPlayerSelectionPaper() {
	       Assert.assertEquals(playerComputer.getPlayerChoice().PAPER.name(), "PAPER");
	    }
	 @Test
	    public void getPlayerSelectionRock() {
	       Assert.assertEquals(playerComputer.getPlayerChoice().ROCK.name(), "ROCK");
	    }
	 @Test
	    public void getPlayerSelectionScisors() {
	       Assert.assertEquals(playerComputer.getPlayerChoice().SCISSOR.name(), "SCISSOR");
	    }
}
