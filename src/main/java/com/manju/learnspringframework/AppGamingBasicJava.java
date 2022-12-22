package com.manju.learnspringframework;

import com.manju.learnspringframework.game.GameRunner;
import com.manju.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    var marioGame = new MarioGame();
	var gameRunner = new GameRunner(marioGame);
	gameRunner.run();
	}

}
