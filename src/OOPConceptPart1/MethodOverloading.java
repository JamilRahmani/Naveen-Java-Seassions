package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(40);
		obj.sum(20,15);
	}
	public static void main(int[] args) {
		
	}
	
	// we can overloading main method also.
	// you can not create a method inside a method
	// duplicate method --> i.e.  same method name with same number of arguments are not allowed
	
	
	//when same method is present in the parent class as well as in the child class with the same name and same number of arguments, is called method-overriding

	//method overloading is --> when the method name is the same with different arguments or input parameter or different data type within the same class.
	public void sum() {//0 input parameter
		System.out.println("Sum method -- zero parameter");
	}
	public void sum(double d) {//1 input parameter
		System.out.println("Sum method -- 1 input parameter");
	}
	
	
	public void sum(int i) {//1 input parameter
		System.out.println("Sum method -- 1 input parameter");
		System.out.println(i);
	}
	public void sum(int k, int j) {//2 input parameter
		System.out.println("sum method -- 2 input parameter");
		System.out.println(k+j);
	}

}
