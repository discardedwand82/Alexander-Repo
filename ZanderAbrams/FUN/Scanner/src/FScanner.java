import java.util.Scanner;
import java.util.Random;
public class FScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Choice;
		String name;
		String Rock;
		String Paper;
		String Scissors;
		int age;
		float weight;
		float num1;
		float num2;
		
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Hello, what is your name???");
		name = input.nextLine();
		
		System.out.println("Ok, what is your age?");
		age = input.nextInt();
		
		System.out.println("Great. Now what is your weight in lbs?");
		weight = input.nextFloat();
		
		System.out.println("Ok. So you are " +name +" who is " +age +" years old, and you weigh " +weight +" lbs");
		System.out.println("Cool...");
		System.out.println();
		System.out.println("So. Now that I know who you are, I guess we can get down to business....");
		System.out.println("MATH!!!");
		System.out.println("Ok so I will be your basic calculator and do basic adding, subtracting, multiplying, and dividing.");
		System.out.println("Now, smart one, please enter your first number");
		num1 = input.nextInt();
		System.out.println(num1);
		System.out.println("Ok, now choose your second number");
		num2 = input.nextInt();
		System.out.println(num2);
		System.out.println("Ok, finally add what you would like to do...");
		System.out.println("You can type: Add, Subtract, Multiply, Divide. MAKE SURE TO USE CAPS AT THE BEGINNING!");
		Choice = input.nextLine();
		Choice = input.nextLine();
		
		if (Choice.equals("Add"))
	    {
	        System.out.println("your answer is " + (num1 + num2));
	    }
	   else if  (Choice.equals("Subtract"))
	    {
	        System.out.println("your answer is " + (num1 - num2));
	    }

	   else if (Choice.equals("Divide"))
	    {
	        System.out.println("your answer is " + (num1 / num2));
	    }
	   else if (Choice.equals("Multiply"))
	    {
	        System.out.println("your answer is " + (num1 * num2));
	    }
	   else 
	    {
	       System.out.println("Sorry that was not one of the things I asked you to type. Project terminated...");
	    }
		
		
		
		
	
		
		
		input.close();
		
		

	}

}
