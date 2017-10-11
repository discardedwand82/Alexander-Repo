/**
 Alexander Abrams

 CSC 200

 This program asks a user for their username and password. If both are correct, it allows them through
 If one of those things is incorrect and does not match, it terminates the program.

 */


import java.util.Scanner;
public class WhileLoop {

    public static void main(String[] args){

        //Initiate Strings and Scanner
        String name = "Alexander";
        String pass = "123pass123";

        Scanner sc = new Scanner(System.in);

        //ask for user input
        System.out.println("Please Enter Your Username And Password: ");
        System.out.println("Username: ");
        String uName = sc.next();
        System.out.println("Password: ");
        String uPass = sc.next();

        //if statement logic checks if both user and pass match
        if (uName.equals(name)&& (uPass.equals(pass))){

            System.out.println("Welcome "+ name);

        }else{

            System.out.println("Wrong Username or Password!. Try Again");

        }

    }


}

/*PSEUDOCODE
Initialize Strings

ask user for their User and Password

if user AND password match
    Welcome them
else
    Wrong. Terminate Program

 */