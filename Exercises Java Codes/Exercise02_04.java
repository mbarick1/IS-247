import java.util.Scanner;

public class Exercise02_04{
      public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print(" Enter a number in pounds: ");
      double numberInPounds = input.nextDouble();
      
      double numberInKilograms = numberInPounds*0.454;
      
      System.out.println(" 55.5 pounds is " + numberInKilograms + " kilograms " ); 
      
      
      
      
      }

}