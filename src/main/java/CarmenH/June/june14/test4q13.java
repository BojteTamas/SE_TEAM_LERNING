package CarmenH.June.june14;

public class test4q13 {
  private static final String leftRope;
  private static final String rightRope;
  //  private static final String bench; // not initialized in the default constructor
  private static final String name = "name";

  static {
    leftRope = "left";
    rightRope = "right";
  }

  static {
    // name="name"; //aready assigned
    // rightRope="right"; //variable rightRope already assigned in prevus statuc block
  }

  public static void main(String[] args) {
    //  bench="bench";// cannot assign a value to final variable bench // this is not the place to
    // initialize a static variable
  }
}
