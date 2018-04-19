import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Mbarick_Traore_Test1
{
   public static void main(String[] args)throws Exception
   {
      DecimalFormat fmt = new DecimalFormat ("0.##");
      
      File file = new File("Mbarick_Traore_Text1.txt");
      
      if(file.exists())
      {
         System.out.println("This file already exists");
         System.exit(0);
      }
      
      PrintWriter output = new PrintWriter("Mbarick_Traore_Text1.txt");
      
      Calendar calendar = new GregorianCalendar();
      
      String[] monthOfTheYear = {"January", "February", "March", "April", 
        "May", "June", "Jully", "August", "September", "October", "Novemeber", "December"};

      output.println("Test 1 - " + monthOfTheYear[calendar.get(Calendar.MONTH)] + " " + 
                     calendar.get(Calendar.DATE) + ", " + calendar.get(Calendar.YEAR)+ "\n");
      output.println("");
      
      output.println("Mbarick Traore");
      
      output.println("");
      
      output.println("C:\\IS247\\Mbarik_Traore_Test1.txt\n");
      
      output.println("");
      
      String[] stringArray = {"Assistant", "Associate", "Full"};
      
      int i;   String rank = "";   double salary = 0;
      for(i = 1 ; i <= 200 ; i++)
      {
         for(int j = 0  ; j < stringArray.length; j++)
         { 
            rank = stringArray[ (int)(Math.random() * stringArray.length)];  
            
            if(rank.equals("Assistant")){
               salary = 50000 + (double)(Math.random() * 30001); 
            }
            else if(rank.equals("Associate")){
               salary = 60000 + (double)(Math.random() * 50001); 
            }
            else{
               salary = 75000 + (double)(Math.random() * 55001);
            }
         } 
      output.println(i + "\t" + "FirstName" + i + "\t" + "LastName" + i + "\t" + rank + "\t" + fmt.format(salary));
      }   
      output.close();
   }
}
