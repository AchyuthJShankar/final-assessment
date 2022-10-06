package oopsPrograms;


interface IfC{
	//int x=4; //"public static final int x;" - added by java compiler
	void fun1(); //"public abstract void fun1();" - added by java compiler
}

public class InterfaceProg implements IfC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceProg obj=new InterfaceProg();
		obj.fun1();

	}
	public void fun1() {
		System.out.println("Fun 1");
	}

}

