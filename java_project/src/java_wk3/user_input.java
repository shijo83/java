package java_wk3;

import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);
		
		try {
		System.out.println("What is your name?");
		String name=reader.next(); //user input for String
		
		System.out.println("How old are you?");
		int n=reader.nextInt(); //user input for integer
		
		System.out.println("Your name is "+name);
		
		System.out.println("and you are "+n+" years old");
		}
	catch (Exception e)  //handles any kind of exception
		{		
		System.out.println("don't put any string value in age and don't input any integer value in name");
		}
	finally 
		{
		System.out.println("**Thanks for providing your Information**");
		}
	}
}
