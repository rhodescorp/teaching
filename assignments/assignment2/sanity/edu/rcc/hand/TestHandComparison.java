package edu.rcc.hand;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.rcc.deck.Card;

public class TestHandComparison {

	@Test
	public void testStraitFlushVersusFullHouse() {
		Card card1 = new Card("Hearts", "A");
		Card card2 = new Card("Hearts", "2");
		Card card3 = new Card("Hearts", "3");
		Card card4 = new Card("Hearts", "4");
		Card card5 = new Card("Hearts", "5");
		
		Card card6 = new Card("Clubs", "K");
		Card card7 = new Card("Clubs", "Q");
		Card card8 = new Card("Hearts", "K");
		Card card9 = new Card("Spade", "Q");
		Card card10 = new Card("Diamond", "Q");
		
		ArrayList<Card> handRaw = new ArrayList<Card>();
		handRaw.add(card1);
		handRaw.add(card2);
		handRaw.add(card3);
		handRaw.add(card4);
		handRaw.add(card5);
		
		
		ArrayList<Card> handRaw2 = new ArrayList<Card>();
		handRaw2.add(card6);
		handRaw2.add(card7);
		handRaw2.add(card8);
		handRaw2.add(card9);
		handRaw2.add(card10);
		Hand hand1 = new Hand(handRaw);
		Hand hand2 = new Hand(handRaw2);
		
		assertTrue(hand1.compareTo(hand2) > 0);
	}

}
