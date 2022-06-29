package MariaD.june_29;

import java.util.*;

public class Pass_by_value_reference {
  public static void nume(String name) {
    name = "Carmen hai acasa";
  }

  public static void main(String[] args) {
    String name = "Nu vreau";
    nume(name); // / the variable assignment is only to the method parameter and doesn’t affect the
    // caller.
    System.out.println(name); // Nu vreau
  }
}
