package interviewQuestion;

public class StringReverseNaveen {

	public static void main(String[] args) {


		// Reverse a String:
		// diffrent between String and StringBuffer
		//do we have reverse function in String?
		String name1 = "jamil";
		
		// Using for loop
		int len = name1.length();
		String rev = "";
		
		for (int i = len-1; i>=0;i--) {
			rev = rev + name1.charAt(i);
		}
		System.out.println(rev);
		
		//2. Using StringBuffer Class
		StringBuffer sf = new StringBuffer(name1);
		System.out.println(sf.reverse());
		
		
	}

}
