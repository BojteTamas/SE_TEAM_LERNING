package CalinA.OCA8.JulOCA.Arrays.CreatingArray;

public class Jul22Varargs {
  static void arg(String str, int... a) {
    System.out.println("String: " + str);
    System.out.println("Number of arguments is: " + a.length);
    for (int x : a) System.out.print(x + " ");
    System.out.println();
  }

  public static void main(String args[]) {
    arg("Argument1", 10, 20, 30);
    arg("Argument2", 5, 6, 7, 8);
    arg("Argument3");
  }
}
// Read from OCA
//        Varargs
