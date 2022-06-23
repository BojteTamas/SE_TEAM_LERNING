package CarmenH.classdesignCh5;

public interface Hop {

  static int getJumpHeight() {
    return 8;
  }

  /**
   * The method getJumpHeight() works just like a static method as defined in a class. In other
   * words, it can be accessed without an instance of the class using the Hop.getJumpHeight()
   * syntax. Also, note that the compiler will automatically insert the access modifier public since
   * all methods in interfaces are assumed to be public.
   */
}
