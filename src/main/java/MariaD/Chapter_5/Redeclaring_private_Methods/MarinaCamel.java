package MariaD.Chapter_5.Redeclaring_private_Methods;

import java.util.*;

class Camel {
  private String number() {
    return "Undefined";
  }
}

public class MarinaCamel extends Camel {
  private int number() {
    return 2;
  }

  public static void main(String[] args) {
    System.out.println(new MarinaCamel().number()); // 2
  }
}
/*
the return type differs in the child method from String to int
the method number() in the parent class in hidden, that's why the method
        number() from the childs class is a new method and not a override
 */
