package JavaBasics;

public class IfElseConceptNaveen {

	public static void main(String[] args) {
	
		
		int a = 30;
		int b = 20;
		
		if (b>a) {
			System.out.println("b is great then a");
		}else {
			System.out.println("a is greater then b");
		}
		// comparison operator
		// < > <= >= == !=
		
		int c = 40;
		int d = 40;
		if (c==d) {
			System.out.println("c and d are equal");
		}else {
			System.out.println("c and d are not equal");
		}
		
		// write a logic to find  out the highest number
		int a1 = 400;
		int b1 = 200;
		int c1 = 300;
		
		// nested if-else
		
		if (a1>b1 & a1>c1) {// false & false = false---- true & false = false ---- true & true = true
			System.out.println("a1 is the greater");
		}else if (b1>c1) {
			System.out.println("b1 is greater");
		}else {
			System.out.println("c1 is the greatest");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
