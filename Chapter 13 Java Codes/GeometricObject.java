public abstract class GeometricObject
{
     private String color = "White"; 
     private boolean filled;
     private java.util.Date dateCreated;
     
     protected GeometricObject()
     {
         dateCreated = new java.util.Date();
     }
     
     protected GeometricObject(String color, boolean Filled)
     {
         dateCreated = new java.util.Date();
         this.color = color;
         this.filled = filled;   
     }
     
     public String getColor()
     {
         return color;
     }
     
     public void setColor(String color)
     {
        this.color = color;
     }
     
     public boolean isFilled()
     {
         return filled;
     }
     
     public void setFilled(boolean filled)
     {
         this.filled = filled;
     }
     
     public java.util.Date getDateCreated()
     {
         return dateCreated;
     }

     public String toString()
     {
         return "Created on " + dateCreated + "\ncolor: " + color + " and filled " + filled;   
     }
     
     public abstract double getArea(); 
     
     public abstract double getPerimeter();     
      
} 