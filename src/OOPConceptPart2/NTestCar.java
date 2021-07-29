
package OOPConceptPart2;

public class NTestCar {
	
	public static void main(String[] args) {
		
		
		NBMWOverRidding b = new NBMWOverRidding();
		//static polymarphism -- compile-time polymathism
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		System.out.println("*******************");
		
		NCar c = new NCar();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("*************");
		
		//Top Casting
		NCar c1 = new NBMWOverRidding();//child class object can be refereed by parent class reference variable --is called-- dynamic polymathism-or->run-time polymathism
		
		
		//Down Casting
		NBMWOverRidding b1 = (NBMWOverRidding)new NCar();// it will give = ClassCastException
	}

}
