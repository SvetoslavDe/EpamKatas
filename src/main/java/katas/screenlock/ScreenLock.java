package katas.screenlock;

import java.util.*;

public class ScreenLock {

	public static int calculateCombinations(char startPosition, int patternLength) {
		if(patternLength==0 || patternLength>9) return 0;
		if(patternLength==1) return 1;
		String full = "ABCDEFGHI";
		full = full.replace(startPosition, 'A').replaceFirst("A",String.valueOf(startPosition));
		Set<String> permutationsSet = new TreeSet<>();
		permutation(full, 1, patternLength, permutationsSet);
		return permutationsSet.size();		
	}
	
	private static void permutation(String str, int si, int li, Set<String> set){   
		if (si == li) {
			str=str.substring(0, li);
			if (isEligible(str)) {
			set.add(str);
			System.out.println(str);
			}
		} else  {   
			for (int i = si; i < str.length(); i++) {    
				str = swapChar(str,si,i);   
				permutation(str, si+1, li, set);   
				str = swapChar(str,si,i);   
			}   
		}   
	}   
	
	public static String swapChar(String str, int i, int j){     
		char temp;   
		char[] chArray = str.toCharArray();   
		temp = chArray[i] ;   
		chArray[i] = chArray[j];   
		chArray[j] = temp;   
		return String.valueOf(chArray);   
		}     
	public static boolean isEligible (String str) {
		boolean result = true;
		if(str.indexOf('A')>=0 && str.indexOf('C')>=0) {
			if(Math.abs(str.indexOf('A')-str.indexOf('C'))==1) {
				if (str.indexOf('B')>=0 && str.indexOf('B')<str.indexOf('C')) result = true;
				else return false;
			}
		}
		if(str.indexOf('A')>=0 && str.indexOf('G')>=0) {
			if(Math.abs(str.indexOf('A')-str.indexOf('G'))==1) {
				if (str.indexOf('D')>=0 && str.indexOf('D')<str.indexOf('G')) result = true;
				else return false;
			}
		}
		if(str.indexOf('A')>=0 && str.indexOf('I')>=0) {
			if(Math.abs(str.indexOf('A')-str.indexOf('I'))==1) {
				if (str.indexOf('E')>=0 && str.indexOf('E')<str.indexOf('I')) result = true;
				else return false;
			}
		}
		if(str.indexOf('G')>=0 && str.indexOf('C')>=0) {
			if(Math.abs(str.indexOf('G')-str.indexOf('C'))==1) {
				if (str.indexOf('E')>=0 && str.indexOf('E')<str.indexOf('C')) result = true;
				else return false;
			}
		}
		if(str.indexOf('I')>=0 && str.indexOf('C')>=0) {
			if(Math.abs(str.indexOf('I')-str.indexOf('C'))==1) {
				if (str.indexOf('F')>=0 && str.indexOf('F')<str.indexOf('C')) result =  true;
				else return false;
			}
		}
		if(str.indexOf('G')>=0 && str.indexOf('I')>=0) {
			if(Math.abs(str.indexOf('G')-str.indexOf('I'))==1) {
				if (str.indexOf('H')>=0 && str.indexOf('H')<str.indexOf('I')) result =  true;
				else return false;
			}
		}
		if(str.indexOf('B')>=0 && str.indexOf('H')>=0) {
			if(Math.abs(str.indexOf('B')-str.indexOf('H'))==1) {
				if (str.indexOf('E')>=0 && str.indexOf('E')<str.indexOf('H')) result =  true;
				else return false;
			}
		}
		if(str.indexOf('D')>=0 && str.indexOf('F')>=0) {
			if(Math.abs(str.indexOf('D')-str.indexOf('F'))==1) {
				if (str.indexOf('E')>=0 && str.indexOf('E')<str.indexOf('F')) result =  true;
				else return false;
			}
		}
			return result;
		}
	public static void main(String[] args) {
		System.out.println(calculateCombinations('E', 4));
	}
} 
