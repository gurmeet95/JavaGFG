package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Prac1 {
	
	public static void main(String [] args) {
		
		
		Map<Integer,Integer> frequencyMap=new HashMap<>();
		
		frequencyMap.put(2,4);  //8
		frequencyMap.put(1,45);  //45
		frequencyMap.put(3,50);  //150  =203
		//frequencyMap.put(2,5);  //10 =  205
		
		int sum=0;
		Set<Map.Entry<Integer,Integer>> entryset=frequencyMap.entrySet();
		
		for(Map.Entry<Integer,Integer>entry:entryset) {
			sum+=entry.getKey() * entry.getValue();
		}
		//Iterator<Map.Entry<Integer,Integer>> elements=frequencyMap.entrySet().iterator();
		System.out.println(sum);
	}

}
