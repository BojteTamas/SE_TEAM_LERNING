package MariaD.july.july_7;

import java.util.*;

public class Initializare3 {
  static {
    add(2);
  }

  static void add(int num) {
    System.out.println(num + " ");
  }

  Initializare3() {
    add(5);
  }

  static {
    add(4);
  }

  {
    add(6); // //instance variables and instance initializers.
  };

  static {
    new Initializare3();
  }

  {
    add(9); // //instance variables and instance initializers.
  };

  public static void main(String... args) {}
}
/*
2
4
  s-au printat mai intai tot ce era inclus in metoda static
6
9
  ////instance variables and instance initializers.
5---s-a initializat constructorul
 */
