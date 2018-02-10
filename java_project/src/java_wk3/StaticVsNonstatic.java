package java_wk3;

public class StaticVsNonstatic {

	static int v=7000;  //static global variable
	
	int g=400; //non static global variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car();

		//creating an object for food
		StaticVsNonstatic x = new StaticVsNonstatic();
		x.food();
		x.destination();
		
		System.out.println(x.g);  //calling non static global variable
	}

public static void car()  //static function
{
	
	System.out.println("i love my mazda3");
}

public void food()  //non static funtion, we have to create an object
{
	System.out.println("i don't like veggies");
}
public void destination()
{
	System.out.println("my dream is to go to paris");
}

public static void state()
{
	System.out.println("I am from texas");
}
}
