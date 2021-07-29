package OOPConceptPart2;

public interface NUSBank {
	
	// in interface we never defined the body of the method-- we only give method definition
	
	int min_Bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();

	
	// only method declaration 
	//no method body -  only method prototype
	// in interface we can declare the variables, variables are by default static in nature
	//variables value will not be changed, its final/constant in nature
	//no static method in interface
	// no main method
	// we can not create the object of the interface
	// interface is abstract in nature 
	
}
