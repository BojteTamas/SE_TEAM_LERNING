package MariaD.Chapter_5.Compiller_Enhacement;

import java.util.*;

// creating a new class
class Canine {
  public double getAverageWeight() {
    return 50;
  }
}

public class Wolf extends Canine {
  public double getAverageWeight() {
    // overriding the method getAverageWeight() using the super keyword
    return super.getAverageWeight() + 20;
  }

  public static void main(String[] args) {
    System.out.println(new Canine().getAverageWeight());//50
    System.out.println(new Wolf().getAverageWeight());//70
  }
}
