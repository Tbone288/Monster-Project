package neat.controller;

import neat.model.HowNeat;

public class NeatController 
{
	private HowNeat firstMonster;
	
	public NeatController()
	{
		firstMonster = new HowNeat("Steve", 2.33, 1, 1, 2, false);
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("Here is mine" + firstMonster);
	}
	
	/*
	 * monster name is Steve
	 * has 2.33 hair
	 * has 1 arm
	 * has 1 nose
	 * has 2 eye
	 * no belly button
	 */
}

