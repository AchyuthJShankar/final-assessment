package oopsPrograms;
//USES AccessDefault1.java to demonstrate default modifiers


class AccessDefault2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Def obj=new Def(); //can access other  default class
		System.out.println("Details of the employee is ");
		//method calling
		obj.fun1("Acchu", 22); //gives input so that other code can print it
		obj.fun1("Ycc", 21);

	}

}