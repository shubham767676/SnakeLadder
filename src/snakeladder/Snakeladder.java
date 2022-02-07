package snakeladder;

import java.util.Random;

public class Snakeladder {

	//class or static variable
	static final int Snake = 2;
	static final int ladder = 1;
	static final int Noplay = 0;
	static int Dice = 0;

	public static void main(String[] args) 
	{
		int position = 0;
		System.out.println("position:"+position);
		while (position < 100) 
		{
		Random ran = new Random();
		int dice = ran.nextInt(6)+1;
		System.out.println("dice: "+dice);
		++Dice;
		
		int optionCheck = ran.nextInt(3);
		System.out.println("optionCheck: "+optionCheck);
		
		if ((optionCheck == ladder) && (position + dice)<=100)
		{
			System.out.println("Ladder");
			position = position + dice;
		}
		
		else if (optionCheck == Snake) 
		{
			System.out.println("Snake");
			position = position - dice;
		}
		else {
			System.out.println("No Play");
		}
		if (position<0)
			position=0;
		System.out.println("position: "+position+"\ndicecount"+Dice);
		}
	}
}

