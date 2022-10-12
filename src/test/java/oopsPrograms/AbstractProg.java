package oopsPrograms;

//Code for Abstract class and method

abstract class AbC{ //Abstract class
	abstract void fun1(String name); //Abstract method
	void fun2() { //non abstract method
		System.out.println("User details can be stored");
	}
}

public class AbstractProg extends AbC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractProg obj=new AbstractProg();
		obj.fun2(); 
		obj.fun1("Acchu"); //abstract method is called
		obj.fun1("Achyuth");
		obj.fun1("YCC");
	
	}
	//Abstract method definition inside sub class
	void fun1(String name) { 
		System.out.println("customer name is "+ name);
	}
}

