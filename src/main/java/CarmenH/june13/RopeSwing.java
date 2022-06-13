package CarmenH.june13;

// import CarmenH.june13.roppee.Roppee;
import static CarmenH.june13.roppee.Roppee.*;

import CarmenH.june13.roppee.*;

public class RopeSwing {
  // has an instance initializer and not a static initializer
  // since RopeSwing is never constructed the instance initializer is not run

  // length is static - changes from one object update this common static variable

  private static Roppee rope1 = new Roppee();
  private static Roppee rope2 = new Roppee();

  {
    System.out.println(rope1.length);
  }

  public static void main(String[] args) {
    rope1.length = 2;
    rope2.length = 8;
    System.out.println(rope1.length);
  }
}