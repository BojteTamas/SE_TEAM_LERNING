package CarmenH.June.june13;

// import CarmenH.June.june13.roppee.Roppee;

import CarmenH.June.june13.roppee.*;

public class RopeSwing {
  // has an instance initializer and not a static initializer
  // since RopeSwing is never constructed the instance initializer is not run

  // length is static - changes from one object update this common static variable

  private static Roppee rope1 = new Roppee();
  private static Roppee rope2 = new Roppee();

  {
    System.out.println(rope1.length); // this never gets to be run
  }

  public static void main(String[] args) {
    rope1.length = 2;
    rope2.length =
        8; // length is static so both rope1 and rope2 point to the same reference to length
    System.out.println(rope1.length);
  }
}
