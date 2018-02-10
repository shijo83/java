package java_wk3;

public class Argument_Function {

public static void main(String[] args) 
{
//sum(4,5);
//addition(6,3,8);
//sub(8,5);
//print("Sean");
age("Dax ",7);
}
	
public static void sum(int x, int y)
{		
	System.out.println(x+y);
}
	
public static void addition(int a, int b, int c)
{
	int x=a+b+c;
	System.out.println(x);
}

public static void sub(int x, int y)
{
	int z=x-y;
	System.out.println("The result is "+ z);
}

public static void print (String x)
{
	System.out.println(x);
}

public static void age (String name, int age)
{
	System.out.println("Identity is equal to "+ name + age);
}
}
