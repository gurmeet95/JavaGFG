package Lecture2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       // 2,4,6,8,10
       // 4,16,36,64,100
       // sum=220;
       
//       int sum=0;
//       for(Integer number:numbers) {
//    	   if(number%2==0) {
//    		   sum+= number*number;
//    	   }
//    	   // This is itterative way if code is long hard to understand another way to do it is
//    	   // declarative way. (Basically clearing displaying that what operations we want to do)
//       }
//       System.out.println(sum);
       
//     int result=  numbers.stream()
//    		 .filter(new Predicate<Integer>() {
//
//		@Override
//		public boolean test(Integer t) {
//			// TODO Auto-generated method stub
//			return t%2==0;
//		}
//    	   
//       }).map(new Function<Integer,Integer>(){
//    	   @Override
//    	   public Integer apply(Integer t) {
//    		   return t*t;
//       }
//       
//       
//       }).reduce(0,new BinaryOperator<Integer>() {
//
//		@Override
//		public Integer apply(Integer t, Integer u) {
//			// TODO Auto-generated method stub
//			System.out.println("In reduce:"+ t +" "+ u);
//			return t+u;
//		}});
//       
       Integer result=  numbers.stream()
    		 .filter(integer -> integer%2==0)
    		 .map(integer ->integer*integer)
    		 .reduce(0,(integer,integer2)-> integer2+integer);
       
       
       
       // stream does not transform our collection into anything.
     System.out.println(result);
     
     
	}

}
