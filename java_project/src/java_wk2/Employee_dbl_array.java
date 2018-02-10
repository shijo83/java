package java_wk2;

public class Employee_dbl_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Employees [][] = new String [3][3];
		
		Employees [0][0] = "Mark Hamill";
		Employees [0][1] = "Larry Vincent";
		Employees [0][2] = "Sally Field";
		
		Employees [1][0] = "Sean Philip";
		Employees [1][1] = "Jen John";
		Employees [1][2] = "Shine Kurien";
		
		Employees [2][0] = "Bonny Mills";
		Employees [2][1] = "Gary Williams";
		Employees [2][2] = "Cody Smith";
		
		//System.out.println(Employees[2][1]);
		
		int rows=Employees.length;
		int cols=Employees[0].length;
		
		for(int rownum=0; rownum<rows; rownum+=2) {
		for(int colnum=0; colnum<cols; colnum+=2){
		
		System.out.println(Employees[rownum][colnum]);
		}
	}
	}
}
