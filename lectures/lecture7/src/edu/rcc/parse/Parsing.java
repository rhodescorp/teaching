package edu.rcc.parse;

public class Parsing {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		String parensString = args[0];
		for (int i = 0; i < parensString.length(); ++i) {
			Character c = parensString.charAt(i);
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					System.out.println("error too many close parens");
				}
			}
		}
		if (stack.peek() == '(') {
			System.out.println("Error too many open parens");
		}
		
		String sentence = "the quick brown fox jumped over the lazy dog";
		String[] wordsOfSentence = sentence.split(" ");
	}

}
