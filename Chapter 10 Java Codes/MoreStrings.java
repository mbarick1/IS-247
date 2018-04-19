public class MoreStrings
{
   public static void main(String[] args)
   {
      String s1 = "Welcome to Java";
      String s2 = new String("Programming is fun");
      String s3 = "Java Java Java";
      
      System.out.println(s1.replace('e','!'));
      System.out.println(s3.replaceAll("Java","Michael"));
      
      System.out.println("Java is cool".matches("Java.*"));
      System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));
      
      char[] chars = s2.toCharArray();
      for (int i = 0; i < chars.length; i++)
      {
         System.out.println(chars[i]);
      }


   
   
   
   
   }
}