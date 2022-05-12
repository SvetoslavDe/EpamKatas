package katas.split;
import java.util.*;
public class Solution {
	
	static int[] splitByValue(int k, int[] elements) {
	      List<Integer> less = new ArrayList<>();
	      List<Integer> more = new ArrayList<>();
	      for(int i = 0; i<elements.length; i++) {
	    	  if(elements[i]<k) less.add(elements[i]);
	    	  else more.add(elements[i]);	    	  
	      }
	      less.addAll(more);
	      return less.stream().mapToInt(x->x).toArray();
	    }
	
	public static void main(String[] args) {
		splitByValue(5, new int[] {1, 3, 5, 7, 6, 4, 2});
		System.out.println("Test");
	}

}
