public class Circle extends GeometricObject
{
   private double radius;
   
   public Circle()
   {}
   
   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public void setRadius()
   {
      this.radius = radius;
   }

   public double getArea()
   {
      return radius * radius * Math.PI;
   }
   
   public double getPerimeter()
   {
      return 2 * radius * Math.PI;
   }

   public void printCircle()
   {
      System.out.println(" The circle was created on " + getDateCreated() + " and the radius is " + radius);
   }

}