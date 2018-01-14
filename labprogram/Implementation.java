

public class Fruit {
 String name = "Fruit";
 
 public void getClassName(){
  System.out.println("Fruit !");
 }
}



public class Apple extends Fruit {
 String name = "Apple";

 @Override
 public void getClassName() {
  System.out.println("Apple !");
 }

 void printName() {
  /*
   * this will print value of 'name' from subclass(Apple)
   */
  System.out.println("Name from subclass : " + name);
  /*
   * this will print value of 'name' from superclass(Fruit)
   */
  System.out.println("Name from subclass : " + super.name);

  /*
   * invoke Apple class's 'getClassName()' method, simply
   */
  getClassName();

  /*
   * invoke (superclass's)Fruit class's 'getClassName()' overriden method,
   * using 'super' class
   */
  super.getClassName();
 }

}



public class Implementation {
 public static void main(String args[]){
  Apple apple = new Apple();
  apple.printName();
 }
}


