package CalinA.OCA8.JulOCA.StringBuildervsStringBuffer.UndestandingEquality;

public class Jul14Equals2 {
  public static void main(String[] args) {
    StringBuffer eq1 = new StringBuffer("ABC");
    StringBuffer eq2 = new StringBuffer("ABC");
    System.out.println(eq1.equals(eq2));
  }
}
