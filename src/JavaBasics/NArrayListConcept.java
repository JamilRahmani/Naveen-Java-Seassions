package JavaBasics;

import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;

public class NArrayListConcept {

	public static void main(String[] args) {


		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
	
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add("Hello");//6
		ar.add(12.88);//7
		ar.add('K');//8
		ar.add(900);//9
		
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
		
		
		System.out.println(ar.get(2));
		
		//to print all value of the ArrayList: for loop
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
		

	}

}
