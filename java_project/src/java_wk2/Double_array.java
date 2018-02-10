package java_wk2;

public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//					r c			   r c 
		String Destinations[][]=new String[4][4];
		
		//first row
	Destinations[0][0]="Arizone";
	Destinations[0][1]="California";
	Destinations[0][2]="Texas";
	Destinations[0][3]="Florida";
	
		//second row
	Destinations[1][0]="New York";
	Destinations[1][1]="Los Angelos";
	Destinations[1][2]="Miami";
	Destinations[1][3]="Dallas";
	
		//third row
	Destinations[2][0]="Houston";
	Destinations[2][1]="New Jersey";
	Destinations[2][2]="San Diego";
	Destinations[2][3]="Oakland";
	
		//forth row
	Destinations[3][0]="Denton";
	Destinations[3][1]="Chicago";
	Destinations[3][2]="Baltimore";
	Destinations[3][3]="Washington DC";
	
	//System.out.println(Destinations[2][0]);
	//System.out.println(Destinations[3][2]);
	
		//arguments for rows and columns
	int rows=Destinations.length;
	int cols=Destinations[0].length;
	
		//for loop for the rows
	for (int rownum=0; rownum<rows; rownum++) {
		
		//for loop for the columns
	for (int colnum=0; colnum<cols; colnum++) {
		
		System.out.println(Destinations[rownum][colnum]);
	}
	}
	}

}
