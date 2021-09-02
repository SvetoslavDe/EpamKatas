package katas.prizedraw;

import java.util.*;
import java.util.stream.Collectors;

public class Rank {
	
	public static String nthRank(String st, Integer[] we, int n) {
		if(st.isBlank())return "No participants";
		String[] originalNames = st.split(",");
		if(originalNames.length < n)return "Not enough participants";
		String stLow = st.toLowerCase();  
		String[] names = stLow.split(",");
		Integer[] winNum = new Integer[names.length];
		for(int i = 0; i<names.length; i++) {
			winNum[i]=(names[i].length()+names[i].chars().sum()-names[i].length()*96)*we[i];
		}
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<names.length; i++) {
			map.put(originalNames[i],winNum[i]);
		}
		System.out.println(map);
		List<Map.Entry<String, Integer>> sorted = map.entrySet()
													 .stream()
													 .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.<String, Integer>comparingByKey()))
													 .collect(Collectors.toList());
		System.out.println(sorted);
		return sorted.get(n-1).getKey();
	}
	
	public static void main(String[] args) {
		String st = "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH";
	    Integer[] we = new Integer[] {1, 4, 4, 5, 2, 1};
	    System.out.println(Rank.nthRank(st, we, 4));
	}

}
