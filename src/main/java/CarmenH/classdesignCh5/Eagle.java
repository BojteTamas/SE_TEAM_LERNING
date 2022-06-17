package CarmenH.classdesignCh5;

public class Eagle extends Bird {
  public int fly(int height) { // this is overloaded - it has a different signature
    System.out.println("Bird is flying at " + height + " meters");
    return height;
  }
  /**
   * public int eat(int food) { // DOES NOT COMPILE -- this is overriden having the same signature -
   * and void is not a subclass of int System.out.println("Bird is eating " + food + " units of
   * food"); return food; }
   */
}
