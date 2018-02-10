package java_wk2;

public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * What is the difference between = vs ==
		 * = means if you are assigning something example int x=4', int y=3;
		 * meaning of == if you are comparing strings for example x==y;
		 * example of operators are ==,=, <=, >=, <. >, &&, & ;
		 * & is when you want to execute two operations
		 * && evaluates the left side of the operation, to right side. It assures both sides needs to be met.
		 */
		
		int x=2;
		int y=4;
		
		if(x==y)
		{
			System.out.println("They are equal.");
		}
		
		else
		{
			System.out.println("They are not equal.");
		}
		
		//System.out.println(x&y);
		
		if(x==y&&x>y)
		{
			System.out.println("x and y can't be real.");
		}
		else
		{
			System.out.println("This logic does not make any sense.");
		}
	}
}
