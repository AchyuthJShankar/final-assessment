package oopsPrograms;
//Method overriding

class Animal{ //Superclass
	void fun() {
		System.out.println("Animal");
	}
}

public class Overriding extends Animal{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OPTION 1
		Animal a=new Animal();
		a.fun(); // calling super class function from it's object
		Overriding obj = new Overriding();
		obj.fun();

	}
	
	void fun() {
		//OPTION 2
		super.fun(); //calls superclass' function from 'super' keyword
		System.out.println("Dog");
	}

}

