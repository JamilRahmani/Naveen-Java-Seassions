package final_Finally_Finalize;

public class FinalizeConcept {

	
	public void finalize() {
		System.out.println("ssssss");
	}
	public static void main(String[] args) {

		// finalize is a method
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();
		
		
	}

}
