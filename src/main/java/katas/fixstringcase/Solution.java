package katas.fixstringcase;

public class Solution {
	
	public static String solve(final String str) {
		int low = 0;
		int up = 0;
        for(int i=0; i<str.length();i++) {
        	if(str.charAt(i)<97)up++;
        	else low++;
        }
        if(low>=up)	return str.toLowerCase(); 
        else return str.toUpperCase();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
