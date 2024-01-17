package Lecture1;
@FunctionalInterface
public interface Default1 {
	int sum();
	default void  print() {
		System.out.println("Hello From default method");
	} 
	default int  sum(int a,int b) {
		return a+b;
		
	} 

}
