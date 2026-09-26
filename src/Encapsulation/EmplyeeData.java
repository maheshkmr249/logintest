package Encapsulation;

public class EmplyeeData {
	//Encapsulation also called as data hiding
		//1. private data variables: this var's cannot be accessed directly from outside the class
			private int ssn;
			private String empName;
			private int empAge;

		public static void main(String[] args) {
			
			EmplyeeData emp = new EmplyeeData();
			emp.setEmpName("Tom Peter");
			emp.setEmpAge(25);
			emp.setSsn(12345);
			
			System.out.println("Employee name is: "+emp.getEmpName());
			System.out.println("Employee age is: "+emp.getEmpAge());
			System.out.println("Employee ssn is: "+emp.getSsn());
		}
	    
		//2. getter and setter methods: to set and get the values of the above var's then we use setter and getter methods
		
		public int getSsn() {
			return ssn;
		}

		public void setSsn(int ssn) {
			this.ssn = ssn;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName; //this.class_var = local_var
		}

		public int getEmpAge() {
			return empAge;
		}

		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}

}
