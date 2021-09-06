package katasa.newcashier;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
	
	public static String getOrder(String input) {
		String[] menu = new String[] {"Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake" , "Coke"};
		Map<String, Integer> menuMap = Map.ofEntries(Map.entry("Burger", 1),
													 Map.entry("Fries", 2),
													 Map.entry("Chicken", 3),
													 Map.entry("Pizza", 4),
													 Map.entry("Sandwich", 5),
													 Map.entry("Onionrings", 6),
													 Map.entry("Milkshake", 7),
													 Map.entry("Coke", 8));
        for(int i=0; i<menu.length; i++) {
        	input = input.replaceAll("(?i)"+ menu[i], menu[i]+ " ");
        }
        String[] k = input.trim().split(" ");
        String result = Arrays.stream(k).sorted(Comparator.comparingInt(x->menuMap.get(x))).collect(Collectors.joining(" "));
		return result;
		
    }
	
	public static void main(String[] args) {
		String text = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza";
		System.out.println(getOrder(text));
	}

}
