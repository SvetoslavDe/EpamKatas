package katas.nextbignumber;

import java.util.*;
import java.util.stream.IntStream;

public class NextBiggerNumber {
	public static long process(long number) {
		int[] input = turnNumberIntoArray(number);
		for(int i=input.length-2; i>=0; i--) {
			try{
				isBiggerNumberToTheRightAndIfSoSwap(input,i);
				Arrays.sort(input, i+1, input.length);
				return  turnArrayToNumber(input);
				}catch(NoSuchElementException e) {
					continue;
				}	
		}
		return -1;
	}
	
	private static void isBiggerNumberToTheRightAndIfSoSwap(int[] input, int i) {
		int minNumberToTheRight = IntStream.of(input).skip(i+1).filter(n->n>input[i]).min().getAsInt();
		if(input[i]<minNumberToTheRight) {
			int j = getIndexOfMinNumber(minNumberToTheRight, input);
			swap(input, i, j);
		}
	}
	private static int getIndexOfMinNumber(int minNumberToTheRight, int[] input) {
		for(int i = input.length-1; i>= 0; i--) {
			if(input[i]==minNumberToTheRight) return i;
		} return 0;
		
	}

	private static void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i]=input[j];
		input[j] = temp;
	}

	public static int[] turnNumberIntoArray(Long number) {
		String numberString = number.toString();
		int[] result = new int[numberString.length()];
		for(int i=0; i<result.length;i++) {
			result[i] = Character.getNumericValue(numberString.charAt(i));
		}
		return result;
	}
	
	private static Long turnArrayToNumber(int[] input) {
		StringBuilder numberString = new StringBuilder();
		for(int i=0; i<input.length;i++) {
			numberString.append(input[i]);
		}
		return Long.parseLong(numberString.toString());
	}
	public static void main(String... args) {
		for(int i=0; i<1000; i +=(int)(Math.random()*100)) {
			System.out.print(i + "   /   ");
			System.out.println(process(i));
		}
	}
}
