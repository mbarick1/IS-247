public class BMI
{
   private String name;                   // no initial value
   private int age;                       // initial value of 20
   private double weight;// in pounds     // no initial value
   private double height;// in inches     // no initial value
   
   private static final double KILOGRAMS_PER_POUND = 0.45359237;        //conversion
   private static final double METERS_PER_INCH = 0.0254;                 // conversion
   
   BMI(String name, double weight, double height)// age has an initial value, so will not in the parameters 
   {
      this(name, 20, weight, height); // default constructor with the initial value of "age" 
   }
   
   
   
   BMI(String name, int age, double weight, double height) //2nd constructor with parameters 
   {
      this.name = name;     // Assigning values to variables or parameters
      this.age = age;       // Assigning values to variables or parameters
      this.weight = weight; // Assigning values to variables or parameters
      this.height = height; // Assigning values to variables or parameters
   }
   
   public String getName()    // 1st getter method
   {
      return name;
   }

   public int getAge()        // 2nd getter method
   {
      return age;
   }
   
   public double getWeight()  // 3rd getter method
   {
      return weight;
   }

   public double getHeight()  // 4th getter method
   {
      return height;
   }

   public double getBMI()  // Method to calculate BMI
   {
      double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH)*(height * METERS_PER_INCH));
      
      return Math.round(bmi * 100) / 100.0; // round to 2 decimal places. 
   } 
   
   public String getStatus()
   {
      double bmi = getBMI();
      
      if(bmi < 16)
         return " Seriously underweight";
      else if(bmi < 18)
         return " Underweight";
      else if(bmi < 24)
         return "Normal weight";
      else if(bmi < 29)
       return "Overweight";
      else if(bmi < 35)
       return "serously Overweight";
      else
       return "gravely Overeight";
   }

}