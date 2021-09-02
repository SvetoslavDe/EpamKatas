package katas.poker;

import java.util.Arrays;

public class PokerHand implements Comparable<PokerHand> {
	private int value;
	
	public PokerHand(String hand) {
		assignValue(hand);
	}
	
	public int getValue() {
		return value;
	}

	private void assignValue(String hand) {
		String[] cards = hand.split(" ");
		Arrays.stream(cards).forEach(x-> System.out.print(x+ " "));
	}

	@Override
	public int compareTo(PokerHand o) {
		return this.value-o.getValue();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
