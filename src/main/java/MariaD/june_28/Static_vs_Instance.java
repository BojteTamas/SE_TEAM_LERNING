package MariaD.june_28;

import java.util.*;

public class Static_vs_Instance {
  private static String nume = "Static class";

  public static void primul() {}

  public static void al_doilea() {}

  public static void al_treilea() {
    System.out.println(nume);
    // java: non-static variable nume cannot be referenced from a static context
  }

  public static void main(String[] args) {
    primul();
    al_doilea();
    al_treilea();
    // Static class
  }
}
