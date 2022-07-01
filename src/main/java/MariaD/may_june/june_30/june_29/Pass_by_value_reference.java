package MariaD.may_june.june_30.june_29;

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
