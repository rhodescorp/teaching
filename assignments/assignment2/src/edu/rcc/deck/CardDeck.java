package edu.rcc.deck;

import java.util.ArrayList;

import edu.rcc.shuffler.Shuffler;

public class CardDeck {
	
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	private CardDeck(String[] suits, String[] ranks) {
		//for (int i = 0; i < suits.length; ++i) {
		//String suit = suits[i];
		for (String suit : suits) {
			for (String rank : ranks) {
				deck.add(new Card(suit, rank));
			}
		}
	}
	
	public Card deal() {
		if (!deck.isEmpty()) {
			return deck.remove(0);
		} else {
			return null;
		}
	}
	
	public static CardDeck getStandardDeck() {
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8",
							"9", "10", "J", "Q", "K", "A"};
		return new CardDeck(suits, ranks);
	}
	
	public static CardDeck getRiggedDeck() {
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		String[] ranks = {"A", "3", "A", "5", "A", "A", "A",
							"9", "10", "J", "Q", "K", "A"};
		
		return new CardDeck(suits, ranks);
	}
	
	public void shuffle() {
		Shuffler<Card> s = new Shuffler<Card>();
		deck = s.shuffle(deck);
	}
	
	
}
