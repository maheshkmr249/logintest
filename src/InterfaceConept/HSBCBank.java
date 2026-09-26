package InterfaceConept;

public class HSBCBank implements USBank, BrazilBank { //we are achieving multiple inheritance
	//Is-a relationship
	
	//If a class is implementing any interface, then its mandatory to define/override all the methods of interface.
	//Overriding from USBank
	
public void credit() {
		
		System.out.println("hsbc---credit");
	}

public void debit() {
		
		System.out.println("hsbc---debit");
	}

public void transfermoney() {
	
	System.out.println("hsbc---transfermoney");
}

//Seperate methods of HSBCBabk class
public void educationloan() {

	System.out.println("hsbc-- educationloan");
}

public void carloan() {
	System.out.println("hsbc-- carloan");
}

//Brazil bank method: ovveriding from brazil bank
public void mutualfund() {
	System.out.println("BrazilBank-- mutualfund");
}
}
