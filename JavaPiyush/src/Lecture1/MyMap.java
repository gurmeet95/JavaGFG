package Lecture1;
@FunctionalInterface
public interface MyMap {
	int add(int a,int b);
	
	 
	default int multiply(int a,int b) {
	     return a*b;
	}
	default int ok(int d,int g) {
		return d+g;
	}
	// from java8 function in interface can also have body.tht function is called default function.
   // default function are not mandatory to implement.
}
