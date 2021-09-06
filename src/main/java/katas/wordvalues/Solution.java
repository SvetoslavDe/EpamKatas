package katas.wordvalues;

import java.util.Arrays;

public class Solution {
	
	 public static int [] nameValue(String [] arr){
	      int[] blah = Arrays.stream(arr).mapToInt(x->calculateValue(x)).toArray();
	      for(int i=0; i<blah.length;i++) {
	    	  blah[i]=blah[i]*(i+1);
	      }
	      return blah;
	    }
	
	 public static int calculateValue(String str) {
		 return str.chars().filter(x->x!=32).map(x->x-96).sum();	 
	 }
	 
	public static void main(String[] args) {
		int[] i = nameValue(new String[]{"codewars","abc","xyz"});
		Arrays.stream(i).forEach(x->System.out.print(x+ " "));
	}
}
