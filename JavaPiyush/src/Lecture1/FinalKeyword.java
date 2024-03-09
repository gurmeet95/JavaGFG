package Lecture1;

public class FinalKeyword {
	
	//1. Constants/Variable = These can be define while declaring or in the constructor.
	//2. Functions.  = can not be overridden in child classes
	//3. Classes   = can not be extended.(All the functions are final automaticaly)
	
	
	final int a;
	static int b=12;
	static final int c;
	public FinalKeyword() {
		this.a=10;
	}
	static {
		c=13;   //static function is going to excecuted before any function even before main function.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword o=new FinalKeyword();
		b=40;
		b=70;
	//	c=70; not able because it is final.
		

	}

}
