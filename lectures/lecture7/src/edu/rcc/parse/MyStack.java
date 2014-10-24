package edu.rcc.parse;

import java.util.*;

public class MyStack {
  private ArrayList<Character> stack;

  public MyStack() {
    this.stack = new ArrayList<Character>();
  }
  
  public Character pop() {
    if (this.stack.isEmpty()) {
      return null;
    } else {
      return this.stack.remove(0);
    }
  }
  
  public Character peek() {
    if (this.stack.isEmpty()) {
      return null;
    } else {
      return this.stack.get(0);
    }
  } 
  
  public void push(Character c) {
    this.stack.add(0, c);
  } 
}
