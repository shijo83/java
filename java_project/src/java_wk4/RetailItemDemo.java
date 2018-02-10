package java_wk4;

import java.util.Scanner;

public class RetailItemDemo
{
   public static void main(String[] args)
   {
      // Create the first item. Use the no-arg constructor.
		RetailItemDemo item1 = new RetailItemDemo();
      item1.setDescription("Jacket");
      item1.setUnitsOnHand(12);
      item1.setPrice(59.95);
      
      // Create the second item. Use the constructor
		// to initialize the fields.
		RetailItemDemo item2 = 
		     new RetailItemDemo();
      // Create the third item. Use the no-arg constructor.
		RetailItemDemo item3 = new RetailItemDemo();
      item3.setDescription("Shirt");
      item3.setUnitsOnHand(20);
      item3.setPrice(24.95);
      
      // Display the info for item1.
      System.out.println("Item #1");
      System.out.println("Description: " + item1.getDescription());
      System.out.println("Units on hand: " + item1.getUnitsOnHand());
      System.out.println("Price: " + item1.getPrice());
      // Display the info for item2.
      System.out.println("\nItem #2");
      System.out.println("Description: " + item2.getDescription());
      System.out.println("Units on hand: " + item2.getUnitsOnHand());
      System.out.println("Price: " + item2.getPrice());
      // Display the info for item3.
      System.out.println("\nItem #3");
      System.out.println("Description: " + item3.getDescription());
      System.out.println("Units on hand: " + item3.getUnitsOnHand());
      System.out.println("Price: " + item3.getPrice());
   }

private String getPrice() {
	// TODO Auto-generated method stub
	return null;
}

private String getUnitsOnHand() {
	// TODO Auto-generated method stub
	return null;
}

private String getDescription() {
	// TODO Auto-generated method stub
	return null;
}

private void setPrice(double d) {
	// TODO Auto-generated method stub
	
}

private void setUnitsOnHand(int i) {
	// TODO Auto-generated method stub
	
}

private void setDescription(String string) {
	// TODO Auto-generated method stub
	
}
}