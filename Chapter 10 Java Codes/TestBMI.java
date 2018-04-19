public class TestBMI
{
   public static void main(String[] args)
   {
   
   BMI bmi1 = new BMI("John doe", 18, 145, 70);
   
   System.out.println("The BMI for " + bmi1.getName() + " of age " + bmi1.getAge() +
      " is " + bmi1.getBMI() + " " + bmi1.getStatus());
      
   BMI bmi2 = new BMI("Peter King", 215, 70);// The default age will be displayed
   
   System.out.println("The BMI for " + bmi2.getName() + " of age " + bmi2.getAge() + 
      " is " + bmi2.getBMI() + " " + bmi2.getStatus());
   }
}