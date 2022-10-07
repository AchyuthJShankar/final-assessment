package oopsPrograms;

//Code for Abstract class and method

abstract class AbC{ //Abstract class
	abstract void fun1(); //Abstract method
	void fun2() { //non abstract method
		System.out.println("non abstract method inside abstract class");
	}
}

public class AbstractProg extends AbC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractProg obj=new AbstractProg();
		obj.fun1();
		obj.fun2();
	
	}
	//Abstract method definition inside sub class
	void fun1() { 
		System.out.println("abstract method");
	}
}

