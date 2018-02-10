package java_wk2;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Boolean is an expression that returns true or false
		 */
		
		int size=100;
		String color="blue";
		
		//Use expression to compute a boolean value
		
		boolean largeandblue= size<=50 && color == "red";
		
		//Test our boolean
		
		if (largeandblue)
		{
			System.out.println("largeandblue = "+ largeandblue);
		}
		
		else
		{
			System.out.println("largeandblue= false");
		}

	}

}
