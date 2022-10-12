package oopsPrograms;
//Method overriding

class Market{ //Superclass
	void fun() { //override method inside superclass
		System.out.println("Product || Price");
	}
}

public class Overriding extends Market{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OPTION 1
		Market a=new Market();
		//a.fun(); // calling super class function from it's object
		Overriding obj = new Overriding();
		obj.fun();

	}
	
	void fun() { //override method inside child class
		//OPTION 2
		super.fun(); //calls superclass' function from 'super' keyword
		System.out.println("Logitech Mouse m170 || INR 400");
	}

}

