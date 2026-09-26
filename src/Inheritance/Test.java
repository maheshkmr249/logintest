package Inheritance;

public class Test {

	//when same method is present in parent class and child class with same name and same no of arguments, is called method overriding
	
	public static void main(String[] args) {
	
		
		//Static or Compile time polymorphism
		BMW b = new BMW(); 
		b.start();  //here we are having start methods in both parent and child but it will first searches in child class if its not find
		            // then it goes to parent class to find that method
		b.stop(); //here it checks in child class, as it is not found there, it went to search in parent class
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("***********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//c.theftsafety----> Parent class cannot access the methods of child class like parent can't access the behaviour of the child

		System.out.println("***********");
		 
		//Top casting
		Car c1= new BMW(); //Child class object can be referred by parent class reference variable---Runtime polymorophism or Dynamic polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.theftsafety-----> will not access
		
		//Down casting will not work as parent can't fit in to child class reference variabl
		//BMW b1= new Car();
		
		//The solution for the above is type casting
		//BMW b1= (BMW)new Car();
	
	}
}
