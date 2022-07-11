package CalinA.OCA8.JulOCA.Deletechartat;

public class Jul11deletechartat {
  public static void main(String[] args) {
    StringBuilder del = new StringBuilder("WelcomeSummer");
    System.out.println("Before remove character: " + del.toString());

    StringBuilder afterRemoval = del.deleteCharAt(10);
    System.out.println("After removal of character" + " at index 10: " + afterRemoval.toString());
  }
}
