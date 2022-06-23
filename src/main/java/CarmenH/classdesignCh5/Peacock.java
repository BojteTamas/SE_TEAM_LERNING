package CarmenH.classdesignCh5;

public class Peacock extends Bird3 {

  public String getName() { // this is overridden
    return "Peacock";
  }

  public static void main(String[] args) {
    Bird3 bird = new Peacock();
    bird.displayInformation();
  }
  /**
   * IMPORTANT the value of the getName() method at runtime in the displayInformation() method is
   * replaced with the value of the implementation in the subclass Peacock.
   */
}
