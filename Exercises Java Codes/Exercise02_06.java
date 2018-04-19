import java.util.Scanner;

public class Exercise02_06{
     public static void main(String[] args){ // Main method
     Scanner input = new Scanner(System.in);
     
     System.out.print(" Enter an integer between 0 and 1000:");// Read a number
     int integer = input.nextInt();
     
     // Find all the digits in the number
     int lastDigit = integer % 10;
     int remainingOfInteger = integer / 10;
     int secondDigit = remainingOfInteger % 10;
     remainingOfInteger = remainingOfInteger / 10;
     int firstDigit = remainingOfInteger % 10;
     
     int sum = lastDigit + secondDigit + firstDigit;
     
     System.out.println(" The sum of all the digit in " + integer + " is " +
                          sum); 
      
     
     }
}    
