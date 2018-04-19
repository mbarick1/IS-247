public class ExampleString
{
   public static void main(String[] args)
   {
      String s1 = "Welcome to Java";
      String s2 = new String("Programming is fun");
      String s3 = "Java Java Java";
      
      System.out.println(s1.replace('e', '!'));
      System.out.println(s3.replaceAll("Java", "Michael"));
      System.out.println("Java is fun".matches("Java.*"));
      
      char[] chars = s2.toCharArray();
      for(int i = 0; i < chars.length; i++)
      {
      System.out.println(chars[i]);
      }
      
   }

}