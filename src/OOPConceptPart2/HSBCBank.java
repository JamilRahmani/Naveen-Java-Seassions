package OOPConceptPart2;

public class HSBCBank implements NUSBank, NBrazilBank{//we are achieving multiple inheritance
	//is-a relationship: mean interface a class relationship
	
	//if a class is implementing any interface, then its mandatory to define/override all the methods of interface.
	
	//overriding from USBank
	public void credit() {
		System.out.println("HSBC--Credit");
	}

	public void debit() {
		System.out.println("HSBC--Debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC-- TransferMoney");
	}
	//Separate method of HSBCBank class	
	public void educationLoan() {
		System.out.println("HSBC - Edu - Loan");
		
	
	}
	public void carLoan() {
		System.out.println("HSBC - Car - Loan");
	}
	//Brazil Bank method: overriding from BrazilBank
	public void mutualFund() {
		System.out.println("HSBC - Mutual Fund");
	}
	
	
	
	
	
	
}
