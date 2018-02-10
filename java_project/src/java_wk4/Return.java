package java_wk4;

public class Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=20;
		int y=50;
		
		int answer=getSum(x,y);
		System.out.println("Answer is "+answer);
	}
public static int getSum(int x, int y) {
	
	int result = x+y;
	return result;
}
	
}
