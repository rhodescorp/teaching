package edu.rcc.hand;

import java.util.ArrayList;

import edu.rcc.deck.Card;

public class Hand implements Comparable<Object> {
	
	//Card[] theCards = new Card[10];
	private ArrayList<Card> theCards = new ArrayList<Card>();
	
	public Hand(ArrayList<Card> theCards) {
		this.theCards = theCards;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Hand) {
			Hand other = (Hand)o;
		}
		// TODO Auto-generated method stub
		return 0;
	}
	

}
