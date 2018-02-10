package java_wk3;

import java.util.Scanner;

public class myInfo_scanner {

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);
		
		System.out.println("**Use _ between words instead of space. Thank you!");
		System.out.println("");
		
		System.out.println("What is your name?");
		String name= input.next(); 
		System.out.println(">>So your name is "+ name);
	
		System.out.println("How old are you?");
		int age = input.nextInt(); 
		System.out.println(">>Ok, you are " + age + " years old");
	
		System.out.println("Your current salary?");
		int salary = input.nextInt(); 
		System.out.println(">>Got it. Your salary is " + salary);
		
		System.out.println("What's your home address?");
		String address= input.next(); 
		System.out.println(">>Your address is " + address);
		
		System.out.println("Everything correct?");
		String answer= input.next(); 
		System.out.println(">>You replied " + answer);
		System.out.println("**Thanks for providing your Information**");
		}
			
	}

