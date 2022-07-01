package MariaD.july.july_1;

import java.io.*;
import java.util.*;

/*
Autoboxing is the automatic conversion between the primitive types and their corresponding object wrapper classes
 */

public class Autoboxing {

  // main driver method
  public static void main(String[] args) {
    // cream un arrray de tip integer
    ArrayList<Integer> maria = new ArrayList<Integer>();
    ArrayList<Integer> second = new ArrayList<Integer>();
    // adaugi valori pt primitive de tip int
    // le convertesti in Integer wrapper object
    for (int i = 2; i < 10; i++)
      System.out.println(second.add(Integer.valueOf(i))); // /true, true, true, true, true
    // dai valori primitivelor de tip int
    // folosesti metoda add()
    // autoboxin
    maria.add(2);
    maria.add(3);
    maria.add(19);
    maria.add(29);

    System.out.println("ArrayList: " + maria); // ArrayList: [2, 3, 19, 29]
  }
}
