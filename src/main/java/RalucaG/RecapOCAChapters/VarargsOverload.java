package RalucaG.RecapOCAChapters;

public class VarargsOverload {
  private void someMethod(int... args) {
    int x = 0;
    for (int i : args) {
      x += i;
    }
    System.out.println("x = " + x);
  }

  private void someMethod(boolean b, String... args) {
    boolean nothing = !b;
    System.out.println("nothing = " + nothing);
    System.out.println("numar de argumente: " + args.length);
  }

  public static void main(String[] args) {
    VarargsOverload obj = new VarargsOverload();
    obj.someMethod(2, 6, 8);
    obj.someMethod(true, "empty is the", "world");
  }
  /**
   * While defining method signature, vararg must be last The variable argument must be the last
   * argument passed to the method. A method can have only one varargs param Every time we use
   * varargs, the Java compiler creates an array to hold the given parameters. In this case, the
   * compiler creates an array with generic type components to hold the arguments.
   */
}
