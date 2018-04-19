public class TestFileReader
{
   public static void main(String[] args)
   {
      ReadFromFile fObject = new ReadFromFile();
      
      fObject.openFile();
      fObject.readFile();
      fObject.closeFile();
   
   }

}