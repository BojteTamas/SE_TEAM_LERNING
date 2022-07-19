// package main.java.CarmenH;
import static main.java.CarmenH.june10.rope.Rope.*; // this one is not used

import main.java.CarmenH.june10.rope.*;

public class Chimp {

  public static void main(String[] args) {
    Rope.swing();
    new Rope().swing();
    System.out.println(Rope.LENGTH);
  }
}

/**
 * public class Rope { public static int LENGTH = 5; static { LENGTH = 10; } public static void
 * swing() { System.out.print("swing "); }
 *
 * <p>} the order of run: Step 1: Rope runs line "public static int LENGTH = 5;" and makes LENGTH to
 * 5 Step 2: then it runs the static initializer and makes LENGTH 10 Step 3: calls the static method
 * swing() and prints "swing " Step 4: to remember: Java allows calling a static method through an
 * instance variable "new Rope().swing();" which runs again the class Rope and prints again "swing "
 * Step 5: prints the LENGTH which had the last assign to 10. so the correct output is "swing swing
 * 10"
 */
