package InterfaceConept;

public interface USBank {
	
	int min_bal =100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	//Only method declaration, no method body-- only method prototype
    //In interface we can declare variables, variables are by default in static in nature
	//var values will not changed, its final/constant/static in nature
	//No static method are allowed in interface
	//we dont have any main method in interface
	//we cannot create the object of interface
	//Interface in abstract in nature
}
