package neat.controller;

import neat.model.HowNeat;
import java.util.Scanner;

public class NeatController 
{
	private HowNeat firstMonster;
	private Scanner keyboardInput;
	
	public NeatController()
	{
		firstMonster = new HowNeat("Steve", 2.33, 1, 1, 2, false);
		keyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("My " + firstMonster);
		System.out.println("My monster has this many eyeballs: " + firstMonster.getEyeCount());
		System.out.println("My monster has this many tentacle arms: " + firstMonster.getArmCount());
		System.out.println("My monster has this many pretzel hairs: " + firstMonster.getHairCount());
		System.out.println("My monster has this many smelly smellers: " + firstMonster.getNoseCount());
	
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase ("yes"))
		{
			System.out.println("What do you want the name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		else
		{
			System.out.println("Gosh dang it I don\'t like my name :(");
		}
		
		
		System.out.println(firstMonster);
		
		System.out.println("Do you want to change how many eyeballs I have?");
		String eyeballanswer = keyboardInput.nextLine();
		
		if (eyeballanswer.equalsIgnoreCase ("yes"))
		{
			System.out.println("How many eyeballs do you want me to have?");
			int newEye = keyboardInput.nextInt();
			firstMonster.setEyeCount(newEye);
		}
		else
		{
			System.out.println("Looks like you don\'t want me looking TOO weird.");
		}
		
		System.out.println("Monster says: I now have " + firstMonster.getEyeCount() + " eye(s)!");
	}
	
	
}

