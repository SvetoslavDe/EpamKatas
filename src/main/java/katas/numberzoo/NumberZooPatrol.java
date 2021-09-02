package katas.numberzoo;

import java.util.stream.IntStream;

public class NumberZooPatrol {
	public static int findMissingNumber(int[] numbers) {
		long inputSum = IntStream.of(numbers).mapToLong(n->n).sum();
		long sizeOfInput = numbers.length;
		long sizeOfFullArray = sizeOfInput + 1;
		long fullSum =(long)(1+sizeOfFullArray)*sizeOfFullArray/2;
		return (int)(fullSum-inputSum);
	}
}
