package CarmenH.pond.goose;

import CarmenH.pond.shore.Bird;

public class Gosling extends Bird { // extends means creates subclass

  public void swim() {
    floatInWater(); // protected member from Bird class
    System.out.println(text); // protected member from Bird class
  }
}
