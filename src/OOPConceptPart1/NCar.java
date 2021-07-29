
package OOPConceptPart1;

public class NCar {

	// Class variable:
	int mod;
	int wheel;

	public static void main(String[] args) {

		// new Car(); --this is the object of the car class
		// new operator/keyword is used to create the object
		// a,b,c -----> object reference variables
		// a,b,c ----> are not the objects these are only reference name for objects

		NCar a = new NCar();
		NCar b = new NCar();
		NCar c = new NCar();

		a.mod = 2015;
		a.wheel = 4;

		b.mod = 2020;
		b.wheel = 4;

		c.mod = 2021;
		c.wheel = 4;

		System.out.println("before assigning the refrences");

		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println(b.mod);
		System.out.println(b.wheel);

		System.out.println(c.mod);
		System.out.println(c.wheel);

		System.out.println("after shifting the refrences");

		// A and C both are referring to the B
		//B is referring to C
		a = b;
		b = c;
		c = a;
		
		a.mod = 10;
		System.out.println(a.mod);// 10
		c.mod = 20;
		System.out.println(a.mod);// 20
		System.out.println(c.mod );
	}

}
