package katas.equalsides;

import java.util.stream.IntStream;

public class Kata {
	public static int findEvenIndex(int[] arr) {
		if(IntStream.of(arr).skip(1).sum()==0)return 0;
		int N = 1;
		while(true) {
			if(IntStream.of(arr).limit(N).sum()==IntStream.of(arr).skip(N+1).sum())return N; 
			N++;
			if(N==arr.length)break;
		} 
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1}));
		System.out.println(findEvenIndex(new int[] {1,100,50,-51,1,1}));
		System.out.println(findEvenIndex(new int[] {20,10,30,10,10,15,35}));
		System.out.println(findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
		System.out.println(findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
	}

}
