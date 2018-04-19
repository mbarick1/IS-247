import java.util.Scanner;

public class ExceptionHandlingExample
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int x = 1;
      
      do
      {
         try
         {
            System.out.print("Enter num1:");
            int num1 = input.nextInt();
         
            System.out.print("Enter num2:");
            int num2 = input.nextInt();
         
            int sum = num1 / num2 ; 
            
            System.out.println(sum);
            
            x = 2;
         }
         
         catch(Exception ex)
         {
            System.out.println("You can't do that");
         }
      
      }while(x == 1);   
   
   }

}