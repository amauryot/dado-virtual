package model;

import java.util.Random;

public class Dice {

	private final int NUMBER_OF_FACES = 6;
	
	private Random random;
	
	public Dice() {
		random = new Random();
	}
	
	public int roll() {
		return random.nextInt(NUMBER_OF_FACES);
	}
}
