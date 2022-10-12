package oopsPrograms;

//Code for Method overloading

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your beneficiary name and age ");
		Overloading obj=new Overloading();
		
		//calling the methods 
		obj.benif(); //input with no arguments
		obj.benif("Acchu"); //input with string only
		obj.benif(22); //input with int only
		obj.benif("Acchu", 22); //input with string and int 

	}
	
	//Method definitions
	void benif() { //method with no arguments
		System.out.println("No args");
	}
	
	void benif(String name) { ////method with only string argument
		System.out.println("Age is missing");
		
		
	}
	void benif (String name, int age) { //method with both arguments
		System.out.println(name+ " is added as benif");
	}
	void benif (int age) { ////method with only int argument
		System.out.println("Name is missing");
		
	}

}
