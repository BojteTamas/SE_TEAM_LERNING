/*package CarmenH.practice;

public class ParkRanger {
  int birds = 10;

  public static void main(String[] data) {
    int trees = 5;
    System.out.print(trees + birds);
  }
}
// non static birds cannot be used in static main
/**
 * The main() method is static and does not have access to any class instance variables. The birds
 * variable is not static and requires a class instance variable to access. Therefore, the code does
 * not compile when the static method attempts to access a non-static variable without an instance
 * of the class.
 */
