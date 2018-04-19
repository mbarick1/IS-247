import java.io.*;
import java.io.FileReader;

public class TryCatchMemo
{
   public void fileAccess()
   {
      try
      {
         FileReader fr = new FileReader("Test");
      }
      catch(FileNotFoundException e)
      {
         System.out.println(e.getMessage());
      }
      finally
      {
         System.out.println("Runs for sure");
      }
   }
   public static void main(String[] args)
   {
      TryCatchMemo tcm = new TryCatchMemo();
      tcm.fileAccess();  
   }
} 