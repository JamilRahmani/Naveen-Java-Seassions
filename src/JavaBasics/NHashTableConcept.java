package JavaBasics;

import java.util.Hashtable;

public class NHashTableConcept {

	public static void main(String[] args) {


		
		Hashtable h = new Hashtable();
		
		h.put("A", "test");
		h.put("B", "Hello");
		h.put("C", "World");
		h.put("D", 500);
		
		System.out.println(h.size());
		System.out.println(h.get("A"));
		
		h.put(1, 100);
		h.put(2, 200);
		h.put(3, "Tom");
		
		System.out.println(h.size());
		System.out.println(h.get(2));
		
		
		Hashtable<Integer,Integer> h2 = new Hashtable<Integer,Integer>();
		
		h2.put(1, 100);
		//h2.put("A", 300); you cannot put this cuz the this only takes Integers
		System.out.println(h2.get(1));
		
		Hashtable<Integer,String> h3 = new Hashtable<Integer,String>();
		
		h3.put(1, "jack");//This one is accepting int & String
		
		
		
		
		
	}

}
