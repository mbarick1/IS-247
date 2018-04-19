public class testGeometricObject
{
   public static void main(String[] args)
   {
      GeometricObject geoObject1 = new Circle(5);
      GeometricObject geoObject2 = new Rectangle(5,3);
      
      // Comparing Objects
      System.out.println("The two geometric object have the same area? " + equalArea(geoObject1, geoObject2));
      
      //Displaying object
      displayGeometricObject(geoObject1);
      displayGeometricObject(geoObject2);
    }
      
    // Method to compare
    public static boolean equalArea(GeometricObject Object1, GeometricObject Object2)
    {
         return object1.getArea() == object2.getArea();
    }
    
    // Method to Display  
    public static void displayGeometricObject(GeometricObject Object)
    {
         System.out.println();
         System.out.println("The area is " + object.getArea());
         System.out.println("The perimeter is " + object.getPerimeter());
    }
   

}