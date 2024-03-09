package Lecture2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pracitce3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		List<Integer> p3=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// print square of all even numbers.
		List<Integer> result1=p3.stream()
				.filter(i-> i%2==0)
				.map(i-> i*i).collect(Collectors.toList());
		
		System.out.println(result1);

				}

}
