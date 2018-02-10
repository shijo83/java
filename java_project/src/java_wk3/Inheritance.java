package java_wk3;

public class Inheritance extends StaticVsNonstatic {

	//Inheritance means to inherit function or variable from a different class. example:-Inheritance extends Function.
	//You can Inherit from only one class.
	//If you are inheriting a non static function or variable you still need to create an object
	
	public static void main(String[] args) {

	//name();
	//addition();
	System.out.println(v); //inheriting a static global variable
	
	Inheritance x= new Inheritance();
	
	System.out.println(x.g); //inheriting a nonstatic global variable
	
	x.food();
	
	state();
	}
	
//overriding method.. meaning you overriding the function you inherited
public static void state()
{
	System.out.println("I am from Arizona");
}

}
