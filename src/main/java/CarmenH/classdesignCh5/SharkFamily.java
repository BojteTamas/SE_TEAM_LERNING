package CarmenH.classdesignCh5;

public interface SharkFamily extends HasFins {

  public default int
      getNumberOfFins() { // this overrides the default method from the interface hasFins
    return 8;
  }

  public double getLongestFinLength();

  /**
   * replaces the default method getLongestFinLength() with a new abstract method, forcing any class
   * that implements the SharkFamily interface to provide an implementation of the method.
   */

  // public boolean doFinsHaveScales() { // DOES NOT COMPILE
  //   return false;
  // } //this method would have to override but is missing default key word
}
