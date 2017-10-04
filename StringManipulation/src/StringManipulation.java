/*
Alexander Abrams

CSC 200

Tanes Kanchanawanchai
 */

import java.lang.*;

public class StringManipulation {

    public static void main(String[] args){

        //creating all the variables
        char letter;
        int SizeOfName, IndexOfString, LastIOfString;
        boolean check, check2;
        String concat, Equals="ABRAMS", Upper="hello", Lower="HELLO", replace, Sub1, Sub2, value, trim, append;


        String First = "Alexander";
        String Last = new String("Abrams");
        StringBuffer buff = new StringBuffer("James");
        StringBuffer buff2 = new StringBuffer("John");

        //Manipulating all the variables
        SizeOfName=First.length();//shows the length of the string First
        letter=First.charAt(5);//Chooses the 5th char in First
        concat= First.concat(Last); //Combines First and Last together
        check = First.equals(Last);//Checks to see is First and Last are logically equal
        check2= Equals.equalsIgnoreCase(Last);//checks to see if string Equals is the same as Last no matter the Case
        IndexOfString = First.indexOf('e');//Scans string First and counts how many times char e is used
        LastIOfString = First.lastIndexOf('e');//scans String Firsts and returns what position char e is last used
        Lower=Lower.toUpperCase();//Converts string lower into all Uppercase
        Upper=Upper.toLowerCase();//converts string upper into all Lowercase
        replace = First.replace("e", "A");//replaces all char e with char A in String First
        Sub1 = Last.substring(4);//Skips until the indicated number then starts the string from there
        Sub2 = First.substring(2,5);//Only prints out the characters between indicated positions
        value=First.valueOf(LastIOfString);//Returns String representation of whatever is mentioned
        trim = Last.trim();//It returns a copy of this string with leading and trailing white space removed, or this string if it has no leading or trailing white space.
        buff2.append(" The Cool Guy");//Basically concatonates a StringBuffer

        //printing all the variables
        System.out.println(SizeOfName);
        System.out.println(letter);
        System.out.println(concat);
        System.out.println(check);
        System.out.println(check2);
        System.out.println(IndexOfString);
        System.out.println(LastIOfString);
        System.out.println(Lower);
        System.out.println(Upper);
        System.out.println(replace);
        System.out.println(Sub1);
        System.out.println(Sub2);
        System.out.println(value);
        System.out.println(trim);
        System.out.println(buff.capacity());//Returns the currenct capacity
        System.out.println(buff2);

    }


}
