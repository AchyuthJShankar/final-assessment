package oopsPrograms;

//Code for Interface


interface IfC{ //Interface class
	//int x=4; //"public static final int x;" - added by java compiler
	void fun1(String name, int num); //"public abstract void fun1();" - added by java compiler
}

public class InterfaceProg implements IfC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceProg obj=new InterfaceProg();
		System.out.println("Name || Price");
		//Method calling
		obj.fun1("Logitech M170", 400); //gives input 
		obj.fun1("Casio 991ES", 900);
		obj.fun1("Moserbear 16GB 3.0", 700);

	}
	public void fun1(String name, int num) { //interface method defination
		System.out.println(name + " || INR "+ num); //Prints based on inputs
	}

}

