package java_wk1;

import java.util.Scanner;

public class BMI_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds, height in inches: "); 
		double wkg = input.nextDouble();
		double hmeters = input.nextDouble();
		
		wkg*= 0.4535;
		hmeters*= 0.0254;
		
		double bmi = wkg / (hmeters * hmeters);
		
		System.out.println("your BMI value is " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("underweight");
			
		}else if (bmi < 25 && bmi >= 18.5) {
			System.out.println("normal");
			
		}else if (bmi <30 && bmi >= 25) {
			System.out.println("overweight");
			
		}else{
			System.out.println("obese");
		}
	}

}
