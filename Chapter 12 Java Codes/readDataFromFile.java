import java.io.*;
import java.util.Scanner;

public class readDataFromFile
{
   public static void main(String[] args)throws Exception
   {
      File file = new File("scores.text");
      
      Scanner input = new Scanner(file);
      
      while(input.hasNext())
      {
         String fName = input.next();
         String lName = input.next(); 
         
         int score = input.nextInt(); 
         
         System.out.println(fName + " " + lName + " " + score ); 
      }  
      input.close();
   }
}