import java.io.*;
import java.util.*;

public class ReadFromFile
{
   
   Scanner input; 
   
   public void openFile()
   {
      try
      { 
          input = new Scanner(new File("hello.txt"));
      }
      catch(Exception ex)
      {
         System.out.println("Could not be found");
      }
   }
   
   public void readFile()
   {
      while(input.hasNext())
      {
         String a = input.next();
         String b = input.next();
         String c = input.next();
         
         System.out.printf("%s %s %s\n",a,b,c);
      }
   }
   
   public void closeFile()
   {
      input.close();
   }
   




}