package OOPConceptPart1;

public class NLocalVsGlobalVariable {
	
	//Global variables -or-  class variables
	String name = "Khan";
	int age = 26;
	

	public static void main(String[] args) {
		int i = 10; // local variable  for main method
		System.out.println(i);
		
		NLocalVsGlobalVariable obj = new NLocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		int a = obj.sum();
		System.out.println(a);
	}
	//we can return any variable from Sum method in main method
	public int sum() {
		int i = 30;//local variable for sum method
		int j = 20;
		int age = 22;
		System.out.println(i);
		return age;
		
	}

}
