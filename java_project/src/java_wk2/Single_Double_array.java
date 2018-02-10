package java_wk2;

public class Single_Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String drink [] = new String [4];
	
	drink [0] = "Dr Pepper";
	drink [1] = "Lemonade";
	drink [2] = "Iced tea";
	drink [3] = "Coffee";
	
	
//double array
	
	String actor[][] = new String[3][3];
	
	actor [0][0]= "Brad Pitt";
	actor [0][1]= "Mat Damon";
	actor [0][2]= "Sandra Bullock";

	actor [1][0]= "George Clooney";
	actor [1][1]= "Jennifer Aniston";
	actor [1][2]= "Tom Cruise";
	
	actor [2][0]= "Angelina Jolie";
	actor [2][1]= "Julia Roberts";
	actor [2][2]= "Will Smith";
	
	System.out.println(actor[1][2]);
	System.out.println("drink choice:");
	System.out.println(drink[2]);
	
}
}
