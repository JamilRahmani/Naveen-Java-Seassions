package OOPConceptPart2;

public class NBMWOverRidding  extends NCar { //"has-a relationship": mean class to class relationship
	
	//method overloading is --> when the method name is the same with different arguments or input parameter or different data type within the same class.

	//when same method is present in the parent class as well as in the child class with the same name and same number of arguments, is called method-overriding
	
	public void start() {//overridden method
		System.out.println("BMW--- Start");
	}

	public void theftSafety() {
		System.out.println("BMW---theftSafety");
	}
}
