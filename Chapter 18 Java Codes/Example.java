import java.util.ArrayList;
public class Example
{
   public static void main(String[] args)
   { 
      ArrayList list = new ArrayList();
      list.add(3);
      list.add("3");
      
      for(int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i) + "");
      }
     
      
   } 
}