//Testing the loan class 

public class testLoan
{
   public static void main(String[] args)
   {
      java.util.Scanner input = new java.util.Scanner(System.in);
   
      System.out.print("Enter yearly interest rate: ");
      double annualInterestRate = input.nextDouble();
      
      System.out.print("Enter number of years: ");
      int numberOfYears = input.nextInt();
      
      System.out.print("Enter loan amount: ");
      double loanAmount = input.nextDouble();
      
      // Create loan Object
      
      Loan loan = new Loan(annualInterestRate, numberOfYears,loanAmount);
   
   // Print loan date, monthly payment, total payment  
   System.out.printf("The loan was created on %s\n " + "The loan monthly payment is %.2f\n " +
   "The total payment is %.2f\n ", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());         
        
   }
}

