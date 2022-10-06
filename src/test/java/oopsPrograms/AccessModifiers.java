package oopsPrograms;

class A{
	//private int x =2; //private variable
	//private void abc() { //private method, can't use outside this class
	//	System.out.println("private");
	//}
	void xyz() {
		System.out.println("public");
	}
}

public class AccessModifiers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.xyz();
		
		//gives error cz these are private and cannot be accessed outside it's class
		//obj.abc(); 
		//obj.x=7;
		//System.out.println(obj.x);

	}

}
