package Lecture2;

import java.util.Arrays;
import java.util.List;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> p1=Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,15);
		//3,6,9,12,15
		//9+36+81+144+225=495
		
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		
		int result= p1.stream()
				.filter(i-> i%3==0)
				.map(i-> i*i)
				.reduce(0,(i,j)->{
					//System.out.println(j);
					return i+j;});
		System.out.println(result);
		int result1= Arrays.stream(arr)
				.filter(i-> i%2==0)
				.map(i-> i*i)
				.reduce(0,(i,j)->i+j);
		
		System.out.println(result1);
		System.out.println(Runtime.getRuntime().availableProcessors());

	}

	}

