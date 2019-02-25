package com.elbjager.in.game.playertest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.elbjager.in.game.executor.GameExecutor;

public class GameEexcuterTest {
	  GameExecutor gameExecutor;
	  @Before	
	    public void createPlayerComputer() 
	    { 
	    	gameExecutor=new GameExecutor();
	    }
	  
		@After public void closePlayerComputer() 
	    {
	   //logic for closing resource
	    } 
		
	@Test
	//commented since it starts the application
	public void test() {
	   // Assert.assertTrue(gameExecutor.beginGame());
	}

}
