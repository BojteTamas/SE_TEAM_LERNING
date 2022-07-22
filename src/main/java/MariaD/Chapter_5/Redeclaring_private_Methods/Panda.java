package MariaD.Chapter_5.Redeclaring_private_Methods;

import java.util.*;

class Bear {
  public static void eat() {
    System.out.println("Bear is eating");
  }
}

public class Panda extends Bear {
  public static void eat() {
    System.out.println("Panda Bear is chewing");
  }

  public static void main(String[] args) {
    Panda.eat();
  }
}
