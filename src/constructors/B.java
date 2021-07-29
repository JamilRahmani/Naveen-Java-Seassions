package constructors;

public class B extends A {

	public B() {
		super();// super keyword: is one single line definition is used to call parent class constructor
				 
		System.out.println("Child class constructor");
	}

	public B(int i) {
		super(10);
		System.out.println("Child class constructor");
	}

	public B(int i, int j) {
		super(10, 20);
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);
	}

}
