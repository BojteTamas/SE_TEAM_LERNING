package RalucaG.MethodsAndEncapsulation;

public class StaticNameAge {

  static int age;
  static String name;
  // This is a Static Method
  static void disp() {
    System.out.println("Age is: " + age + " years " + "and 4 months");
    System.out.println("Name is: " + name);
  }
  // This is also a static method
  public static void main(String args[]) {
    age = 31;
    name = "Raluca";
    disp();
  }
}
