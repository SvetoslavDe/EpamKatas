package katas.buddies;
import java.util.*;
public class Bud {
	 public static String buddy(long start, long limit) {
			for(long i=start; i<= limit; i++) {
				long sum = factorize(i)-1;
				if(sum>i && factorize(sum)-1==i)
					return "("+i+" "+ sum +")";
				
			}
			return "Nothing";
		}
		public static long factorize(long n){
			Set<Long> factors = new TreeSet<>();
			factors.add(1L);
			long sum = 1;
			for(long i=2; i<Math.sqrt(n); i++) {
				if(n%i==0) {
					if(!factors.add(i))break;
					sum+=i;
					if(!factors.add(n/i))break;
					sum+=n/i;
				}
			}
			//factors.stream().forEach(x->System.out.print(x+" "));
		//	System.out.println(sum);
			return sum;
			
		}
	public static void main(String[] args) {
		System.out.println(buddy(1071625, 1103735));

	}

}
