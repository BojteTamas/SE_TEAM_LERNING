package CarmenH.may.may31;

public class Static {

  private static String name = "Static class"; // added static

  public static void first() {}

  public static void second() {}

  public static void third() { // added static
    System.out.println(name);
  }

  public static void main(String args[]) {
    first();
    second();
    // new Static().third(); //this would solve the problem from main
    third();
  }
}
