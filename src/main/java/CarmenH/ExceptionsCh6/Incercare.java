package CarmenH.ExceptionsCh6;

public class Incercare {

  public static void main(String[] args) {
    String e1 = "Summer";
    String e2 = "Summer";
    System.out.println(e1.equals(e2)); // here are compared 2 strings, their values

    StringBuffer eq1 = new StringBuffer("ABC");
    StringBuffer eq2 = new StringBuffer("ABC");
    System.out.println(
        eq1.equals(eq2)); // StringBuffer it's an object so the references are not equal.
    System.out.println(eq1);
    System.out.println(
        eq1.toString()
            .equals(eq2.toString())); // managed to compare the actual values from the object
    // references YEY
  }
}
