package Lecture2;

import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
      // 1,3,5,7,9
      // 1,9,25,49,81
      
      int result=l1.stream()
    		  .filter(i-> i%2!=0)
    		  .map(i-> i*i)
    		  .reduce(0,(i,j)-> j+i);
      
      System.out.println(result);
	}

}
