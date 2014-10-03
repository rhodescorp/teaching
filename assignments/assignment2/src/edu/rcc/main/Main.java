package edu.rcc.main;

import java.util.ArrayList;

import edu.rcc.deck.Card;
import edu.rcc.deck.CardDeck;
import edu.rcc.hand.Hand;

public class Main {

	public static void main(String[] args) {
		Card c = new Card("Diamond", "2");
		CardDeck d = CardDeck.getStandardDeck();
		d.shuffle();
		ArrayList<Card> cards1 = new ArrayList<Card>();
		ArrayList<Card> cards2 = new ArrayList<Card>();

		for (int i = 0; i < 5; ++i) {
			cards1.add(d.deal());	
			cards2.add(d.deal());
		}
		Hand hand1 = new Hand(cards1);
		Hand hand2 = new Hand(cards2);
		System.out.println(hand1);
		System.out.println(hand2);
		System.out.println(hand1.compareTo(hand2));
		
	}

}
