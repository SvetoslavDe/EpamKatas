package katas.doublecola;

public class Line {
	public static String WhoIsNext(String[] names, int n) {
		double a =(double)n/names.length;
		int i=0;
		int sum=0;
		int remain=0;
		while(true) {
			sum+=(Math.pow(2, i));
			if(sum>=a) {
				break;	
			}
			i++;
		}
		remain = n - names.length*(sum-(int)Math.pow(2,i));
		return names[(int)(Math.ceil(remain/Math.pow(2,i))-1)];
	}
	public static void main(String[] args) {
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		System.out.println(WhoIsNext(names, 13));

	}
}
