package katas.nextbiggerbinary;

import java.util.Arrays;

public class Kata {
	public static int nextHigher(int n) {
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		char[] s = String.valueOf(binary).toCharArray();
		for(int i=s.length-2; i>=0; i--) {
			if(s[i]<s[i+1]) {
				char temp=s[i];
				s[i]=s[i+1];
				s[i+1]=temp;
				Arrays.sort(s,i+1,s.length);
				binary=String.valueOf(s);
				return Integer.parseInt(binary, 2);
			}
		}	 
		binary = binary + "0";
		s = String.valueOf(binary).toCharArray();
		Arrays.sort(s,1,s.length);
		binary=String.valueOf(s);
		System.out.println(binary);
		return Integer.parseInt(binary, 2);
	}
	
	public static void main(String[] args) {
		System.out.println(nextHigher(1022));
	}
}
