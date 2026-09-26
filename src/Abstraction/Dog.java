package Abstraction;

public class Dog extends Animal {

	public static void main(String[] args) {
		
		Dog d= new Dog();
		d.eat();

		
		Animal a = new Dog();
		a.eat();
		
		//Dog d = new Animal(); //will not work(Downcasting)
//		Animal a = new Animal(); //will not work(Downcasting)
  }
}
