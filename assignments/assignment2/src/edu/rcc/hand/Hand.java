package edu.rcc.hand;

import java.util.ArrayList;

import edu.rcc.deck.Card;

public class Hand implements Comparable<Object> {
	
	//Card[] theCards = new Card[10];
	private ArrayList<Card> theCards = new ArrayList<Card>();
	
	public Hand(ArrayList<Card> theCards) {
		this.theCards = theCards;
	}
	
	public String toString() {
		String s = "";
		for (Card c : theCards) {
			s += c.toString() + ", ";
		}
		return s;
	}

	/**
	 * 0 -> equal
	 * 1 -> this > o
	 * -1 -> this < o
	 */
	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Hand)) {
			return 1;
		}
		Hand other = (Hand)o;
		// TODO Auto-generated method stub
		return 0;
	}
	

}
