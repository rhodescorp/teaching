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
	/**
	 * @param suit
	 * @param face
	 */
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
	
	public boolean isSameFace(Card c) {
		return this.face.equals(c.getFace());
	}
	
	public int getNumericalValue() {
		if (face.equals("A")) {
			return 14;
		} else if (face.equals("K")) {
			return 13;
		} else if (face.equals("Q")) {
			return 12;
		} else if (face.equals("J")) {
			return 11;
		} else {
			return Integer.parseInt(face);
		}
	}
	
	public String toString() {
		return face + " of " + suit;
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
