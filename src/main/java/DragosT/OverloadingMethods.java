package DragosT;

public class OverloadingMethods {
  public void fly(int numMiles) {}
  // public int fly(int numMiles) { } will not compile because only the return type differs
  public void fly(short numFeet) {} // method overloading fly

  public boolean fly() {
    return false;
  } // method overloading fly

  void fly(int numMiles, short numFeet) {} // method overloading fly

  // overloading with varargs
  public void fly(int[] lengths) {} // method overloading fly to array list
  // we are not allowed to over- load methods with the same parameter list
  // public void fly(int... lengths) { } // it compiles to the same parameter list

  // autoboxing will work while overloading methods
  public void fly1(int numMiles) {}

  public void fly1(Integer numMiles) {}

  public static String example(String s) {
    return "1";
  }

  public static String example(String... s) {
    return "2";
  }

  public static String example(Object O) {
    return "3";
  }

  public static String example(String s, String t) {
    return "4";
  }

  public static void main(String[] args) {
    System.out.println(example("a")); // prints 1
    System.out.println(example("b", "x")); // prints 4
    System.out.println(example("aasd", "das", "has")); // prints 2
    System.out.println(example("f")); // prints 1
  }
}
