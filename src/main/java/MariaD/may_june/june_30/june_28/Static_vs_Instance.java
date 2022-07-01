package MariaD.may_june.june_30.june_28;

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
