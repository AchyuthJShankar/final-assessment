package oopsPrograms;

//Code for Method overloading

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj=new Overloading();
		obj.sum();
		obj.sum(1,4);

	}
	
	void sum() {
		System.out.println("No args");
	}
	
	void sum(int a, int b) {
		System.out.println("Sum is "+(a+b));
		
	}

}
