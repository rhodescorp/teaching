package edu.rcc.shuffler;

import java.util.ArrayList;
import java.util.Random;

public class Shuffler<T> {

	

	public ArrayList<T> shuffle(ArrayList<T> deck) {
		ArrayList<T> shuffledDeck = new ArrayList<T>();
		Random r = new Random(System.currentTimeMillis());
		while (!deck.isEmpty()) {
			int index = Math.abs(r.nextInt()%deck.size());
			shuffledDeck.add(deck.remove(index));
		}
		return shuffledDeck;
	}

}
