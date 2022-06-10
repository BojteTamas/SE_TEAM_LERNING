package MariaD.june_8;

import java.util.*;

/// JAVA ARRAYS
// String & StringBuilder are implemented using an array of characters
// an array = an ordered list. it can contain duplicates
// A. CREATING an Array of Primitives int[] numbers1 = new int[3];
// type of array: int
// array symbol: []
// size of array [3]
// the default value for the elements is 0, and the indexes start counting from 0, same as string
// int => PRIMITIVE
// int [] => OBJECT
// EQUALS does not look at the elements of the array
public class Arrays_8june {
  public static void main(String[] args) {
    String[] bugs = {"cricket", "beetle", "ladybug"};
    String[] alias = bugs;
    System.out.println(bugs.equals(alias)); // true//use equals because array is an object
    System.out.println(bugs.toString()); // [Ljava.lang.String;@372f7a8d
  }
}
