// Exercise 18: A program that asks the user to input a string then uses a recursive method to reverse it

// Import scanner
import java.util.Scanner;

public class Exercise_18_Eva_2
{
      public static void main(String[] args)
      {
         // Declare object, scanner, and empty string
         Exercise_18 obj = new Exercise_18();
         Scanner scan = new Scanner(System.in);
         String input = "";
         
         // Prompt user for a string, retries if empty
         System.out.println("Enter a string, then press ENTER: ");
         input = scan.nextLine();
         while(input.isEmpty())
         {
            System.out.println("Invalid Input!");
            System.out.println("Enter a string, then press ENTER: ");
            input = scan.nextLine();
         }
      
         // Prints the output of the reverse method 
         System.out.println(obj.reverse(input));
   
      }
   
      // Takes the input and runs itself on the substring after the first letter, repeats, and stops once it gets to the last letter and returns result
      public String reverse(String input)
      {
         if (input.length() <= 1)
            return input;
            
        return reverse(input.substring(1)) + input.charAt(0);
      }
}