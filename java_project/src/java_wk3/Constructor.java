package java_wk3;

public class Constructor {

//The purpose of constructor is to re write the default value.
//to make a constructor we have to use the class name.
	
	Constructor() //constructor
	{
	int age=34;
	String name="Sean";
	
	System.out.println(age);
	System.out.println(name);
	}
	
	public static void main(String[] args) {

	Constructor age= new Constructor();
	
	//System.out.println(age.age);

	//System.out.println(age.name);

	}
	
}
