package java_wk1;

public class weight {

	public static void main(String[] args) {
		
		/*
Weight = 155 lbs, Height = 5'7" (67")
Calculation: [(155 x 0.4535) ÷ (67 x 0.0254)2] 
		 */
		
		double w=155*0.4535;
		double h=67*0.0254;
		double BMI=w/(h*h);
		
		System.out.println("BMI result");
		System.out.println(BMI);
		
		/*
If your BMI is less than 18.5, it falls within the underweight range.
If your BMI is 18.5 to <25, it falls within the normal.
If your BMI is 25.0 to <30, it falls within the overweight range.
If your BMI is 30.0 or higher, it falls within the obese range.
		 */
		
		if(BMI<18.5) 
		{
			System.out.println("underweight");
		}
		else if (BMI>=18.5 && BMI<25) 
		{
			System.out.println("normal");
		}
		else if (BMI>=25 && BMI<30)
		{
			System.out.println("overweight");
		}
		if (BMI>=30)
		{
			System.out.println("obese");
		}
		
		
	}

}

