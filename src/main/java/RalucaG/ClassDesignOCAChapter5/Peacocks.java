package RalucaG.ClassDesignOCAChapter5;

public class Peacocks extends Birdds {
  @Override
  public String getName() {
    return "Peacock";
  }

  public static void main(String[] args) {
    Birdds birdds = new Peacocks();
    birdds.displayInfo();
  }
  /**
   * the method getName() is overridden in the child class Peacock. More importantly, though, the
   * value of the getName() method at runtime in the displayInformation() method is replaced with
   * the value of the implementation in the subclass Peacock even though the parent class Bird
   * defines its own version of getName() and doesn’t know anything about the Peacock class during
   * compile-time, at runtime the instance uses the overridden version of the method, as defined on
   * the instance of the object.
   */
}
