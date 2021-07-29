package final_Finally_Finalize;

import java.util.concurrent.ExecutionException;

public class FinallyConcept {

	public static void main(String[] args) {

		// finally is a block
		
		//test1();
		//test2();
		division();

	}
	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		
		finally
		{
			System.out.println("inside finally block");
		}
		
	}
	
	public static void test2() {
		try {
			System.out.println("inside test2");
		}
		finally {
			System.out.println("finally code in test2 method");
		}
	}
	
	
	 public static void division() {
		 int i = 10;
		 try {
			 int k = i/0;
			 System.out.println(k);
		 }catch(ArithmeticException e) {
			 System.out.println("divided by zero");
		 }
		 finally {
			 System.out.println("execute this code even after any exeption");
		 }
	 }
	
	
	
	
	

}
