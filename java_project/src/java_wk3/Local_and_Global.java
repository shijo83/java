package java_wk3;

public class Local_and_Global {

	static int c=6000;  //Global variable can be used in any function

	public static void main(String[] args) {

	System.out.println(c);	
	
	salary();
	DreamSalary();
	}

public static void salary()	//local variable is only local to the function, and only can be used inside that function.

{	
	int a=7000;
	System.out.println(a+c);
}

public static void DreamSalary()
{
	int b=10000;
	System.out.println(b);
}
}
