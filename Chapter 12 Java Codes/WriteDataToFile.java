import java.io.*;

public class WriteDataToFile
{
   public static void main(String[] args)throws Exception
   {
      File file = new File("scores.text");
      
      if(file.exists())
      {
         System.out.println("This file already exists");
         System.exit(0);
      }
      
      PrintWriter output = new PrintWriter(file);
      
      output.print("Mbarick Traore");
      output.println(90);
      output.print("Mamadou Traore");
      output.println(85);   
      output.close();

   }
}