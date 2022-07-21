package MariaD.Chapter_5.Overriding_method;

import java.util.*;

class InsuficientDataExceptions extends Exception {}

class Reptile {
  protected boolean hasLegs() throws InsuficientDataExceptions {
    throw new InsuficientDataExceptions();
  }

  protected double getWeight() throws Exception {
    return 2;
  }
}

public class Snake extends Reptile {
  protected boolean hasLegs() {
    return false;
  }

  protected double getWeight() throws InsuficientDataExceptions {
    return 2;
  }

  private static void main(String[] args) {
    System.out.println(new Snake().hasLegs()); // 2
  }
}
