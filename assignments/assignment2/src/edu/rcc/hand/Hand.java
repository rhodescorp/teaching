package edu.rcc.hand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
	
	private ArrayList<Card> getHandInNumericalOrder() {
		ArrayList<Card> sorted = new ArrayList<Card>();
		sorted.addAll(this.theCards);
		Collections.sort(sorted, new Comparator<Card>() {

			@Override
			public int compare(Card o1, Card o2) {
				Integer o1Value = o1.getNumericalValue();
				Integer o2Value = o2.getNumericalValue();
				return o1Value.compareTo(o2Value);
				
			}
			
		});
		return sorted;
	}

	/**
	 * a method to get cards that have the same value
	 */
	private boolean isPair(ArrayList<Card> sortedCards) {
		
		Card previousCard = null;
		for (Card c : sortedCards) {
			/*
			if (previousCard == null) {
				previousCard = c;
			} else {
				if (previousCard.isSameFace(c)) {
					return true;
				} else {
					previousCard = c;
				}
			}
			*/
			if (previousCard != null && previousCard.isSameFace(c)) {
				return true;
			} else {
				previousCard = c;
			}
			
			
		}
		return false;
	}
	
	
	/**
	 * if the sum of the integer array is equal to the following:
	 * 1 - 
	 * @return
	 */
	private ArrayList<Integer> numberOfSameCards() {
		ArrayList<Card> sortedCards = this.getHandInNumericalOrder();
		
		ArrayList<Integer> cardCounts = new ArrayList<Integer>();
		int numbSame = 1;
		for (int i = 0; i < sortedCards.size() - 1; ++i ) {
			if (sortedCards.get(i).isSameFace(sortedCards.get(i+1))) {
				++numbSame;
			} else {
				for (int j = 0; j < numbSame; ++j) {
					cardCounts.add(numbSame);
				}
				numbSame = 1;
			}
		}
		for (int i = 0; i < numbSame; ++i) {
			cardCounts.add(numbSame);
		}
		
		
		return cardCounts;
	}
	
	/**
	 * 5 - high card || strait || strait flush || flush
	 * 7 - pair
	 * 9 - 2 pair
	 * 11 - 3 of a kind
	 * 13 - full house
	 * 17 - four of a kind
	 * @param inputArray
	 * @return
	 */
	private int getSum(ArrayList<Integer> inputArray) {
		int sum = 0;
		for (int i : inputArray) {
			sum += i;
		}
		return sum;
	}
	
	/**
	 * 0 - high card
	 * 1 - pair
	 * 2 - 2 pair
	 * 3 - three of a kind
	 * 4 - strait
	 * 5 - flush
	 * 6 - full house
	 * 7 - four of a kind
	 * 8 - strait flush
	 * @return
	 */
	private int getRank() {
		ArrayList<Card> sorted = this.getHandInNumericalOrder();
		int rawSum = getSum(numberOfSameCards());
		switch (rawSum) {
			case 7:
				return 1;
			case 9:
				return 2;
			case 11:
				return 3;
			case 13:
				return 6;
			case 17:
				return 7;
			default:
				//TODO CHECK FOR ALL OTHER HAND TYPES
		}
		boolean isFlush = isFlush(sorted);
		boolean isStrait = isStrait(sorted);
		if (isFlush && isStrait) {
			return 8;
		} else if (isFlush) {
			return 5;
		} else if (isStrait) {
			return 4;
		} else {
			return 0;
		}
	}
	
	private boolean isFlush(ArrayList<Card> theCards) {
		
		for (int i = 0; i < theCards.size() - 1; i++) {
			if (!theCards.get(i).isSameSuit(theCards.get(i + 1))) {
				return false;
			}
		}
		return true;
		
	}
	
	/**
	 * 
	 * @param sortedCards - all have unique faces
	 * @return
	 */
	private boolean isStrait(ArrayList<Card> sortedCards) {
		
		for (int i = 0; i < theCards.size() - 1; i++) {
			int current = theCards.get(i).getNumericalValue();
			int next = theCards.get(i + 1).getNumericalValue();
			
			if (current + 1 == next || 
					(current == 5 && next == 14)) {
				continue;
			} else {
				return false;
			}
			
		}
		return true;
		
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
		
		boolean isThisPair = this.isPair(this.getHandInNumericalOrder());
		
		ArrayList<Card> otherNumerical = other.getHandInNumericalOrder();
		ArrayList<Card> thisNumerical = this.getHandInNumericalOrder();
		
		
		//call the card hierarchy class
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
