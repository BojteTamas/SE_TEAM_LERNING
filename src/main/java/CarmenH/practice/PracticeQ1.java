package CarmenH.practice;

class A {
  public static final void main(String[] args) { // if we remove final - the output is B
    // if we keep final we must comment class B - not allowed to create main in child class if
    // parent is final
    System.out.println("A");
  }
}
/*
class B extends A {
    public static void main(String[] args) {
        System.out.println("B");
    }
}
 */

class C extends A {}

public class PracticeQ1 {
  public static void main(String[] args) {
    C.main(args); // Will invoke B.main
  }
}
/**
 * Adding final to A.main would prevent accidental hiding of A.main. In other words, adding final to
 * A.main guarantees that B.main is not allowed, and that C.main therefore prints "A" as opposed to
 * for instance "B".
 *
 * <p>in conclusion: adding final to a main method will not allow to create another main in the
 * child class
 */
