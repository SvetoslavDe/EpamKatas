package katas.recursion101;

public class Solution {
	
	public static int [] solve(int a, int b){
		if(a==0 || b==0) return new int[] {a, b};
		else if(a >= 2*b) return solve(a - 2*b, b);
		else if(b >= 2*a) return solve(a, b - 2*a);
		else return new int[] {a, b};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
