package java_wk2;

public class Function {
	
	//Function performs an action
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	name();
	age();
	favorite();
	addition();
	multiply();
	place();
	rows();
	}
public static void name()

{
	System.out.println("my name is sean");
}

public static void age()
{
	int age=9;
	System.out.println(age);
}

public static void favorite()
{
	String color="blue";

		System.out.println("my favorite color is "+ color);
}

public static void addition()
{
	int x=5+5;
	
		System.out.println("if I add 5 plus 5, the answer is " + x);
}
public static void multiply()
{
	int x=2*5;
	
		System.out.println("if I multiply 2 times 5, the answer is " + x);
}
public static void place()
{
	String y="Texas";
	
		System.out.println(y);
}

public static void rows()
{
	String name[] = new String[2];
	
	name[0] = "Shaju";
	name[1] = "Ramya";
	
	System.out.println(name[1]);
}
}
