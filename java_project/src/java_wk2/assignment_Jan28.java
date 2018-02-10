package java_wk2;

public class assignment_Jan28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1. print the sum of two numbers
		int x=74 + 36;
		{
		System.out.println("1. If I add 74 & 36, then answer is " + x);
		}
		
	//2. divide two numbers and print on the screen
		int y= 50 / 3;
		{
		System.out.println("2. dividing 50 by 3, it will give " + y);
		}
		
	//3. area and perimeter of a rectangle
		double w=5.6; 
		double h=8.5;
		double area=w*h;
		double perimeter=2*(w+h);
		{
		System.out.println("3. The area of the rectangle is "+ area);
		System.out.println("   The perimeter of the rectangle is "+ perimeter);
		}
		
	//4. calculate the sum of two integers and return true if the sum is equal to a third integer		
		int add=5+10;
		boolean sum= add<=15;	
		
		if (sum)
		{
		System.out.println("4. sum = "+ sum);
		}
		else
		{
		System.out.println("4. sum= false");
		}
	//5. convert seconds to hour, minute and seconds	
		double one_sec=1;
		double sec_min=one_sec*60;
		double min_hr=sec_min*one_sec;
		double sec_hr=sec_min*min_hr;
		{
		System.out.println("5. seconds in an minute " + sec_min);
		System.out.println("   minutes in an hour " + min_hr);
		System.out.println("   seconds in an hour " + sec_hr);
		}
	//6 Make one single array table and a double array table with Integers. Print all the values with for loop
		String Map []=new String[3];
		
		Map [0]="6. London";
		Map [1]="   Paris";
		Map [2]="   Germany";
		
		for (int row=0; row<Map.length;row++)
		{
		System.out.println(Map[row]);
		}
		
		
		//double array
		
		String Cars[][]=new String[2][2];
		
		Cars[0][0]="Toyota";
		Cars[0][1]="Honda";
	
		Cars[1][0]="Lexus";
		Cars[1][1]="Acura";

		int rows=Cars.length;
		int cols=Cars[0].length;
	
		for (int rownum=0; rownum<rows; rownum++) 
		for (int colnum=0; colnum<cols; colnum++) 
		{
		System.out.println(Cars[rownum][colnum]);
		}
		
		//7. if and else program with == ,<=,>=, && operators.
		int a=4;
		int b=6;
		
		if(a==b && a>b)
		{
			System.out.println("7. a and b can't be real.");
		}
		else
		{
			System.out.println("7. This logic does not make any sense.");
		}
		if (a<=b && a>=b)
		{
			System.out.println("7. logic is not real.");
		}
		else
		{
			System.out.println("   a & b is not real.");
		}
	}

}

