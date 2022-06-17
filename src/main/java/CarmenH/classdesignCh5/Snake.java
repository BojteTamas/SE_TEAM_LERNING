package CarmenH.classdesignCh5;

public class Snake extends Reptile {

  @Override
  protected boolean hasLegs() { // it ok that the child class does not throw any exception
    return false;
  }

  @Override
  protected double getWeight()
      throws InsufficientDataException { // it is ok InsufficientDataException it is a subclass of
    // Exception from contruction
    return 2;
  }

  /**
   * protected double getHeight() throws Exception { // DOES NOT COMPILE return 2; } this is not
   * correct because Exception is not a subclass of InsufficientDataException
   */

  /**
   * protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE return 10; }
   * this is also not correct because the parent class does not throw an exception
   */
}
