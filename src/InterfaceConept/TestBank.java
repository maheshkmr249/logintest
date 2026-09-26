package InterfaceConept;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal=200;//We cant change the value of min_bal as it is static in nature by default
		//USBank b = new USBank()-->we can't create object of interface, so it will throw an error 
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
        hs.educationloan();
        hs.carloan();
        
        //dynamic polymorphism
        //child class object can be referred by parent interface reference variable
        USBank b = new HSBCBank();
        b.credit();
        b.debit();
        b.transfermoney();
        //b.educationloan(); //This two methods will not be acceptable as this are not ovveridden methods 
        //b.carloan();
	}
}
