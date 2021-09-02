package katas.snail;

import java.util.*;

public class Snail {
	private static List<Integer> result = new ArrayList<>();
	private static int c=0;
	public static int[] snail(int[][] input) {
		int n = input[0].length;
		if(c>n/2) {
			return result.stream().mapToInt(x->x).toArray();
		}
		else{for(int i=c;i<n-c;i++)result.add(input[c][i]);
			for(int i=c+1; i<(n-c);i++)result.add(input[i][n-1-c]);
			for(int i=n-c-2;i>=c;i--)result.add(input[n-c-1][i]);
			for(int i=n-c-2;i>=c+1;i--)result.add(input[i][c]);
			c++;
			 return snail(input);	
		}
	}
	public static void main(String[] args) {
//		int[][] input = {{481, 360, 927, 483, 829, 228, 10, 308, 181, 445},
//						{366, 781, 502, 839, 840, 68, 171, 217, 459, 356},
//						{96, 316, 486, 677, 5, 987, 343, 378, 856, 968},
//						{81, 593, 984, 785, 548, 528, 991, 508, 840, 400},
//						{112, 351, 202, 248, 109, 602, 227, 638, 541, 430},
//						{60, 505, 703, 850, 803, 698, 921, 832, 338, 91},
//						{472, 628, 319, 16, 856, 288, 270, 895, 988, 279},
//						{252, 124, 971, 256, 817, 944, 878, 420, 614, 169},
//						{560, 80, 896, 892, 635, 732, 53, 994, 40, 510},
//						{81, 246, 710, 535, 340, 344, 250, 338, 137, 602}};
//		int[] test = {};
//		int[][] input = {test};
		int[][] input = {{30, 760,560,1},
						 {865, 827,333,2},
						 {444,231,532,3},
						 {214,353,4213,4}};
		int[] result = snail(input);
		for(Integer i:result)System.out.print(i+" ");
	}
}
