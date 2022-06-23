package CarmenH.classdesignCh5;

public class Bunny implements Hop {

  public void printDetails() {
    //  System.out.println(getJumpHeight()); // DOES NOT COMPILE
    // instead, this will solve the problem:
    System.out.println(Hop.getJumpHeight());
  }
  /**
   * without an explicit reference to the name of the interface the code will not compile, even
   * though Bunny implements Hop. In this manner, the static interface methods are not inherited by
   * a class implementing the interface
   */
}
