package snakeladder;

public class Snakeladder {

	public static void main(String[] args) {
		int position=0;
			System.out.println("Intial Position " + position);
			
			int player1 = (int)(Math.floor(Math.random() * 10) % 6) +1;
			System.out.println("Dice rolled value: " + player1);
	}
}