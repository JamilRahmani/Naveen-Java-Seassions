package JavaBasics;

public class ArrayConceptNaveen {

	public static void main(String[] args) {
		
		// array: to store similar data type values in a array variable
		
		//lowest bound/index = 0
		// upper bound/index = n-1 (n is size of array)
		// one dimention array
		
		// Dis-advantages of array:
		//1. size is fixed -- Static array -- to overcome of this problem -- we use collections --like: Arraylist,Hashtable -- called: use dynamic array
		//2. store similar data types -- to overcome of this problem, we use object array.
		
		//1. int array:
		int i  [] = new int [4]; 
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i.length); // size/length of array
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		
		// print all the values of array: use for loop
		
		for (int j =0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2. double array:
		double d[]= new double [3];
		d[0] =12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		//3. char array:
		char c[] = new char [4];
		c[0] = 'q';
		c[1] = 'p';
		c[2] = 'm';
		c[3] = 'f';
		
		//4. boolean array:
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5. String array:
		String s[] = new String [3];
		s[0] = "Test";
		s[1] = "Hello";
		s[2] = "World";
		
		System.out.println(s[2]);
		
		//6. object array: (Object is a class) -- is used to store different data types values
		Object ob[] = new Object [6];
		ob[0] = "Tom";
		ob[1] =  45;
		ob[2] = 78.45;
		ob[3] = "1/2/1995";
		ob[4] = 'M';
		ob[5] = "Virginia";
		
		System.out.println(ob[3]);
		
		for (int k = 0; k<ob.length;k++) {
			System.out.println(ob[k]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
