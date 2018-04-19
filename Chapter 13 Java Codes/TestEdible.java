public class TestEdible
{
   public static void main(String[] args)
   {
   
      Object[] objects = {new Tiger(), new Chicken(), new Apple()};
      for(int i = 0; i < objects.length; i++)
      {
         if(objects[i] instanceof Edible)
         {
            System.out.println(((Edible)objects[i]).howToEat());
         }
         else 
         {
            System.out.println("Object is not Edible like Tiger");
         }
      }
   }
}

class Animal
{
}

//This means: chicken is an animal because of exttends / chicken implement methods in Edible interface class
class Chicken extends Animal implements Edible
{
   public String howToEat()
   {
      return "chicken: Fried";
   }
}

class Tiger extends Animal
{
}

// This class doesn't have to implement howToEat method because it's an abstract class but it can or subclasses will implement them.
abstract class Fruit implements Edible
{

} 

//subclass for fruit
class Apple extends Fruit
{
   public String howToEat()
   {
      return "Apple: Make apple cider ";
   }

}

class orange extends Fruit
{
   public String howToEat()
   {
      return "Orange: Make orange juice ";
   }

}
