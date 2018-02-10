package java_wk3;

import java.util.Scanner;

public class retailStore {

	public static void main(String[] args) {

		//only 3 products(ID#)
		double ID555441 = 10.00;
		double ID666551 = 43.00;
		double ID333221 = 11.00;
		
		//tax calculation
		double tax = .08;
		
	try {
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		{
		System.out.println("Which product's price do you want to know?");
		String product=reader.next();  
		System.out.println("There are several "+product+". What is the product ID for this "+product+"?");}
	
	int n = reader.nextInt(); 
		if (n==555441) {
		System.out.println("The product ID "+ n+ " price is " + "$" + ((tax*ID555441) + ID555441)+" with tax");}
		
		else if (n==666551) {
		System.out.println("The product ID "+ n+ " price is " + "$" + ((tax*ID666551) + ID666551)+" with tax");}
		
		else if (n==333221) {
		System.out.println("The product ID "+ n+ " price is " + "$" + ((tax*ID333221) + ID333221)+" with tax");
		}
		else
		{
		System.out.println("**Please double check this product ID "+n+" you've entered and try again, or contact customer service**");
		}
	}catch (Exception e) 
		{ 
	    System.out.println("**please use only integer value for product ID**");
		}
		
   finally {
 	  System.out.println("<Thanks for using this product pricing system>");
   }
	
	String name = "Sean";
	
	switch (name) {
	
	case "Matt":
	System.out.println("Matt, any other product or need to try again? then please refresh!");
	break;
	
	case "Jen":
	System.out.println("Jen, any other product or need to try again? then please refresh!");
	break;
	
	case "Sean":
	System.out.println("Sean, any other product or need to try again? then please refresh!");
	break;
	
	default:
	System.out.println(">>>I dont know your name<<<");
	break;
	}
}
	
	
	public static void place()
	{
		String place="StoreName";
		System.out.println(place);
	}

	}

