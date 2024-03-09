package Lecture2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// Unchecked exception - Runtime exception(No need to handle)
		// checked exception - compile time (Need to handle them)
		
		// FileReader filereader=new FileReader("/d/abc.txt");
		// we need to handle this filenot found exception
		
//		try {
//			FileReader filereader=new FileReader("/Documents/abc");
//			FileWriter filewriter=new FileWriter("/d/abc.txt");
//			int a=1/0;
//		}catch(FileNotFoundException  e) {
//			e.printStackTrace();
//			
//		}catch(IOException e) {
//			System.out.println("Inside IpException");
//			e.printStackTrace();
//
//	}
		// parent exceotion class must be writeen after child class 
		// here we can handle all exception ourself
		// in another way jvm can handle all the exceptions
		
		
		// second way
		
	try {
		file();
	}catch(Exception e) {
		e.printStackTrace();
	}

}
	public static void file() throws IOException{
		try{FileReader filereader=new FileReader("D:\\aqe.txt");
		FileWriter filewriter=new FileWriter("D:\\aqe.txt");
		}
		catch(Exception e) {
			throw e;
		}finally {
			System.out.println("In finally block will run always");
		}
	}
}
