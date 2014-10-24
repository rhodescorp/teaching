package edu.rcc.combinatorics;

import java.util.ArrayList;

public class Choose {

	/**
	 * 
	 * @param n - n's elements must be unique
	 * @param k
	 * @return
	 */
	public ArrayList<ArrayList<String>> nChooseK(
			ArrayList<String> n, int k) {
		return nChooseK(n, k, null);

		
	}
	
	public ArrayList<ArrayList<String>> nChooseK(
			ArrayList<String> n, int k, ArrayList<String> current) {
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		
		if (current == null) {
			current = new ArrayList<>();
		}
		if (current.size() == k) {
			result.add(current);
			return result;
		} else {
			int startIndex = n.indexOf(current.get(current.size() - 1));
			//if the elements we can select from in n are fewer than we need to fill out current
			if (n.size() - startIndex < k - current.size()) {
				return result;
			}
			for (int i = startIndex; i < n.size(); ++i) {
				ArrayList<String> nCopy = new ArrayList<>(n);
				ArrayList<String> currentCopy = new ArrayList<>(current);
				currentCopy.add(nCopy.get(i));
				//ArrayList<ArrayList<String>> resultFromRecursiveCall = nChooseK(nCopy, k, currentCopy);
				//result.addAll(resultFromRecursiveCall);
				result.addAll(nChooseK(nCopy, k, currentCopy));
			}
			return result;
		}
		
	}
}
