package java_wk3;

public class retail_overloading {

	public static void main(String[] args) {
		
		System.out.println("Product prices:");
		
		prices(50,41);
		price(22);
	}
	
public static void price(int a)

{
	System.out.println("$"+a);
}

public static void prices(int a, int b)
{
	System.out.println("$"+a+"+"+b);
	System.out.println("$"+(a-b));
}
}	
