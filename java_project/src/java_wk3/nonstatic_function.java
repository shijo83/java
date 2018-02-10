package java_wk3;

public class nonstatic_function {

	public static void main(String[] args) 

		//Make an argumental Non static function.		
	{
		nonstatic_function a = new nonstatic_function();
		a.laptop();
		a.year();
	}

public void laptop() 
	{
	System.out.println("mine is hp");
	}

public void year() 
	{
	System.out.println("2012");
	}
}
