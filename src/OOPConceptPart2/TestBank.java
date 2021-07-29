package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(NUSBank.min_Bal);
		
		HSBCBank hs = new HSBCBank();
		
		hs.debit();
		hs.credit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		
		//dynamic polumarphism:
		//child class object can be referred by parent interface refrence variables
		NUSBank b = new HSBCBank();
		b.debit();
		b.credit();
		b.transferMoney();
		
		
	}

}
