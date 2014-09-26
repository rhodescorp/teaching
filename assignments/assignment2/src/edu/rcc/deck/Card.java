package edu.rcc.deck;

import java.util.ArrayList;

public class Card {

	/**
	 * this is to track all the cards made,
	 * static is a single shared member variable across all instances (objects)
	 */
	//private static ArrayList<Card> cardsMade = new ArrayList<Card>();
	
	/**
	 * Heart, Spade, Club, Diamond
	 */
	private String suit;
	private String face;
	public Card(String suit, String face) {
		super();
		this.suit = suit;
		this.face = face;
	}
	public String getSuit() {
		return suit;
	}
	public String getFace() {
		return face;
	}
	
	public boolean isSameSuit(Card c) {
		return this.suit.equals(c.getSuit());
	}

	/*
	public Card(String suit, String face) {
		this.suit = suit;
		this.face = face;
		//cardsMade.add(this);
	}
	*/

	/*
	public static ArrayList<Card> getAllCardsMade() {
		return Card.cardsMade;
	}
	*/
	
	
	
	
	
	
}
