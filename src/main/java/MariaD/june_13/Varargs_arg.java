package MariaD.june_13;

import java.util.*;

// variable arguments in java simplifies the creation of methods that need to take a variable no. of
// arguments

/*public class Varargs_arg {

  // A method that takes variable
  // number of integer arguments.
  static void concediu(int... a) {
    System.out.println("number of arguments" + a.length);
    for (int i : a) System.out.println(i + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    concediu(100); // number of arguments1  100
    concediu(1, 3, 5, 6); // number of arguments4     1,3,5,6
    concediu(); // number of arguments0
  }
}
 */

public class Varargs_arg {
  static void concediu(String str, int... a) {
    System.out.println("string " + str);
    System.out.println("numar de argumente: " + a.length);
    for (int i : a) {
      System.out.println(i + "");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    concediu("Grecia", 50, 1000); // string Grecia, numar de argumente: 2 , 50  10000
    concediu("Cipru", 1, 2, 3, 4, 5); // string Cipru, numar de argumente: 5, 1,2,3,4,5
    concediu("Spania"); // string Spania, numar de argumente: 0
  }
}
