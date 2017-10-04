/*
Alexander Abrams

CSC 200

Tanes Kanchanawanchai
*/

//Imports
import java.util.Scanner;

//Class
public class IfElse {


    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);//initiate scanner

        System.out.printf("Option 1: Use Println \nOption 2: Use Printf\n\n");
        String uInput = sc.next();//get input

        /**
         first if statement checks for input one
         second if statement checks for input two
         else statement returns nothing and asks for a restart
        */

        double nums = 5*3.14159;
        if (uInput.equals("1")){

            System.out.println("this is in uppercase\n");//only a string
            System.out.println("a\n");//shows an a
            System.out.printf("3445\n", 3445);//Double
            System.out.printf(Float.MAX_VALUE+"\n");//Exponential FP Number
            System.out.printf("3.14159\n");//Float

        }else if (uInput.equals("2")){

            System.out.printf("%S \n", "this is in uppercase");//Converts sentence to uppercase
            System.out.printf("%C \n", 'a');//Converts to Uppercase
            System.out.printf("%10d \n", 3445);//Double
            System.out.printf("%7e \n", Float.MAX_VALUE);//Exponential FP Number
            System.out.printf("%4.6f \n", 3.14159);//Float

        }else{

            System.out.println("Sorry, That Was Incorrect. Please Run This Again");

        }

    }


}
