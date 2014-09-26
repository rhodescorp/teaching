package edu.rcc.hand;

import java.util.ArrayList;

import edu.rcc.deck.Card;

public class Hand {
	
	private ArrayList<Card> theCards = new ArrayList<Card>();
	
	public Hand(ArrayList<Card> theCards) {
		this.theCards = theCards;
	}
	
	public int compareTo(Object o) {
		//TODO
		return 0;
	}
}
