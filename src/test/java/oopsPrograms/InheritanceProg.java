package oopsPrograms;

//Code for Inheritance 

class GrandParent{ //Parent class for Parent1
	void m1() {
		System.out.println("Enter the Credentials");
		System.out.println("Username and Password");
	}
}

class Parent1 extends GrandParent{ //Parent class for main class
	void m2() {
		System.out.println("Correct Credentials");
	}
}

public class InheritanceProg extends Parent1 { //child class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceProg obj = new InheritanceProg();
		obj.m1(); //calls grandparent class method
		obj.m2(); //calls parent class method
		obj.m3(); //calls child method
	}
	void m3() {
		System.out.println("Login allowed");
	}

}

