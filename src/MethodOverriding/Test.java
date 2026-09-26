package MethodOverriding;

public class Test {

	public static void main(String[] args) {
		Animal obj = new Dog();  // Parent reference, child object
        obj.sound();
	}
}
