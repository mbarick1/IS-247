/*
Write a program that asks the user to input a string then uses a recursive method to output the string in the reverse order.  ie.  
User inputs 12345 and the program outputs 54321.

    * Prompt the user for the string, don't expect it to be passed as an attribute
    * You must use a recursive method, not a loop.
    * Include error handling (will it work for a 5 year old?)
    * Make sure to comment your code appropriately (can someone else follow your logic)
    * It must run from the command line

Submit a .java file named Exercise_18.java

Your classmates will be grading your program so the file name and contents should be anonymous.  FYI - I can see who submits what so
don't put your name inside the .java file either.
*/

import java.util.*; 

public class Exercise_18
{ 
   public static void main(String[] args)//Main method 
   {
      Scanner input = new Scanner(System.in); // Create a Scanner
      
      boolean continueInput = true;// Initial value of condition to re-enter the right input
      do // Looping untill the right input is entered  
      {
         try // Making sure they entered the right input
         {
            System.out.print("Enter a string: ");// Asking user to enter input
            String n = input.nextLine();// Reading input entered
            
            System.out.println("Reverse of " + n + " is " + reverse(n));// Displaying string reverse
 
            continueInput = false; //Condition not to re-enter the input
         }
         catch(InputMismatchException ex)// Catching error If they enter a wrong input
         {
            System.out.println("Try again. (You entered the incorrect imput: a string is required) ");// Displaying error messgage  
            input.nextLine(); // Re-entering the right input
         }  
      }while(continueInput);// Condition to re-enter input 
   }
   
   public static String reverse(String s)//Method to reverse String
   {
      if(s.length() <= 1)// Base case
         return s;
      else
         return reverse(s.substring(1, s.length())) + s.charAt(0); // Recursive call    
   }
}