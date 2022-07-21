package MariaD.Chapter_5.Overriding_method;

import java.util.*;

class Camel {
  // protected String - nu merge
  // he parent method uses the protected modifier, but the child method uses the private modifier,
  // making it less accessible in the child method than in the parent method.
  String getNumberOfHumps() {
    return "Undefined";
  }
}

public class MariaCamel extends Camel {
  // private int - nu poti override un string si sa declari un int
  String getNumberOfHumps() {
    return "2";
  }

  public static void main(String[] args) {
    System.out.println(new MariaCamel().getNumberOfHumps());
  }
}
