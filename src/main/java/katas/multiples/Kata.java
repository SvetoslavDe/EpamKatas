package katas.multiples;

public class Kata {
	
	public static int[] multiples(int m, int n) {
		int[] result = new int[m];
		for(int i=1; i<=m; i++){
			result[i-1]=n*i;
		}
		return result;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
