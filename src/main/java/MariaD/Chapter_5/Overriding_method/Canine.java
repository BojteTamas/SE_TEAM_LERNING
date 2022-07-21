package MariaD.Chapter_5.Overriding_method;

import java.util.*;

class Dog {
  public double weight() {
    return 40;
  }
}

public class Canine extends Dog {
  public double weight() {
    return weight() + 20; // Exception in thread "main" java.lang.StackOverflowError
    // at MariaD.Chapter_5.Overriding_method.Canine.weight(Canine.java:13)
    // return super.weight() + 10;
  }

  public static void main(String[] args) {
    System.out.println(new Dog().weight()); // 40
    System.out.println(new Canine().weight()); // 50
  }
}
