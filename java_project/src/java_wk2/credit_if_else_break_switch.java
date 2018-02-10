package java_wk2;

public class credit_if_else_break_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int creditScore1 = 620;
		int creditScore2 = 700;
		
		switch (creditScore1) {
		
		case 500:
		System.out.println("Ben, your credit score is too low and you won't get approved");
		break;
		
		case 650:
		System.out.println("Ben, your credit score is okay, so you might get approved");
		break;
		
		case 720:
		System.out.println("Ben, your credit score is good and you will get approved!");
		break;
		
		default:
		System.out.println("Ben, I dont know your credit score");
		break;
		}
		
		if (creditScore2<=650)
		{
			System.out.println("John, your credit score is low and you may not get approved");
		}
		else if (creditScore2>=700)
		{
			System.out.println("John, your credit score is good and you will get approved!");
		}
	}

}
