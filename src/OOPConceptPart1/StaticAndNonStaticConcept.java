package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	// global variable: the scope of the global variables will be available across all the functions with some conditions
	
	String name = "Khan";//non static global variable
	static int age = 27;// static global variable
	
	public static void main(String[] args) {
		// how to call static method and variables?
		//1. direct calling:
		sum();
		//2. calling classname:
		StaticAndNonStaticConcept.sum();
		
		// calling static variables
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variables:
		//we have to create object for non static methods:
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static method by using object reference? yes i can access
		obj.sum();// warning will be given
		
		
		
	}
	public void sendMail() { //no static method
		System.out.println("send mail method");
	}
	
	public static void sum() { //static method
		System.out.println("Sum method");
	}

}
