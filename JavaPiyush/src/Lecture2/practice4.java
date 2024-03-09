package Lecture2;

import java.util.Arrays;
import java.util.List;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		    
	       Integer result=  numbers.stream()
	    		 .filter(integer -> integer%2==0)
	    		 .map(integer ->integer*integer)
	    		 .reduce(0,(integer,integer2)-> add(integer,integer2));
	       System.out.println(result);

	}
	
	public static int add(int x,int x1) {
		return x+x1;
	}
	

}
