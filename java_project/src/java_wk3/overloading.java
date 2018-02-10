package java_wk3;

public class overloading {

	public static void main(String[] args) {
		
		//overloading methods has same names but different arguments.
		
		numbers(8,9);
		numbers(6);
	}
	
public static void numbers(int n)

{
	System.out.println(n);
}

public static void numbers (int n, int p)
{
	System.out.println(n+"+"+p);
	System.out.println(n+p);
}
}	
