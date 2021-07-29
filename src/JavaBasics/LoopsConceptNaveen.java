package JavaBasics;

public class LoopsConceptNaveen {

	public static void main(String[] args) {
		
		//1. While loop:
		// Dis-advantage of while loop: it will generate infinite loop if you don't give incremental/decremental part.
		
		int i =1; //initialization
		while(i<=10) { //conditional
			System.out.println(i);
			i=i+1; //incremental or decremental
		}
		System.out.println("************************");
		
		//j++ mean j= j+1
		
		// 1 to 10
		//2. for loop:
		for (int j =1;j<=10;j= j+1) {//initialization, conditional, incremental/decremental
			System.out.println(j);
			
		}
		System.out.println("***************");
		
		//-1 > -10 : True
		//1 > 10 : False
		
		//print 10 to 1
		//k-- mean k = k-1
		for (int k =10;k>=-10; k--) {
			System.out.println(k);
		}
		
		
		
		
		
		

	}

}
