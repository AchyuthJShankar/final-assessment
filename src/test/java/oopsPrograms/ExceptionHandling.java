package oopsPrograms;

//Code for Exception handling 

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=1;
			int y=0;
			int z=x/y; //runtime Arithmetic exception
			System.out.println(z);
		}
		catch(ArithmeticException e) { 
			System.out.println("cannot divide by zero");
			System.out.println(e); //java.lang.ArithmeticException: / by zero
		}
		
		finally {
			System.out.println("always executed");
		}
	}

}