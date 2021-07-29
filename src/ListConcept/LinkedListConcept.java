package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {


		LinkedList<String> ll = new LinkedList<String>();
		
		//add:
		ll.add("test");
		ll.add("QTP");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("content of linkedlist: "+ ll);
		//addfirst:
		ll.addFirst("Jamil");
		//addlast:
		ll.addLast("automation");
		System.out.println("content of linkedlist: "+ ll);
		
		//get:
		System.out.println(ll.get(0));
		//set:
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove first  and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist: "+ ll);
		
		ll.remove(2);
		System.out.println("content of linkedlist: "+ ll);
		
		//how to print all the values of linkedList:
		//for loop
		System.out.println("****using for loop");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		//advance for loop
		System.out.println("***using advance for loop");
		for ( String str: ll) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("****using Iterator");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("****using While loop");
		//while loop
		int num = 0;
		while (ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
	}

}
