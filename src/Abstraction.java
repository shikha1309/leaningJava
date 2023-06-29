abstract  class Animal {
    Animal(){
        System.out.println(" You are creating a animal class constructor");
    }
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}
  class Horse extends Animal {
    Horse(){
        System.out.println(" This is the Horse class constructor ");
    }
     public void walk(){
         System.out.println(" They have 4 legs");
     }
  }


  class  Chicken  extends Animal{
    public void walk(){
        System.out.println(" They  walk on  2 legs");

    }
  }

public class Abstraction   {
    public static void main( String args[ ]) {
        Horse horse =new Horse();
//
        // abstract class can not be instantiated
//        Animal animal = new Animal();
//        animal.walk();
    }
}
