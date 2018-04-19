import java.util.Scanner;

public class Exercise03_11
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   System.out.print( " Enter a month form 1-12 : ");
   int month = input.nextInt();
   
   System.out.print( " Enter a year : ");
   int year = input.nextInt();

   switch (month)
      {
      case 1:System.out.println( " January has 31 days "); break;
      case 2:if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )
               System.out.println( " february has 29 days "); 
             else
               System.out.println( " February has 28 days " );break;
      case 3:System.out.println( " March has 31 days "); break;
      case 4:System.out.println( " April has 30 days "); break;
      case 5:System.out.println( " May has 31 days "); break;
      case 6:System.out.println( " June has 30 days "); break;
      case 7:System.out.println( " Jully has 31 days "); break;
      case 8:System.out.println( " August has 31 days "); break;
      case 9:System.out.println( " September has 30 days "); break;
      case 10:System.out.println( " October has 31 days "); break;
      case 11:System.out.println( " November has 30 days "); break;
      case 12:System.out.println( " December has 31 days "); break;

      }

   }

}