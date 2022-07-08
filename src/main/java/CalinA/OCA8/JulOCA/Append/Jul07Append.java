package CalinA.OCA8.JulOCA.Append;

public class Jul07Append {
  public static void main(String[] args) {
    StringBuilder app = new StringBuilder("Water is fresh!");
    System.out.println(app);
    app.append('$');
    System.out.println("Result after" + " appending = " + app);

    app = new StringBuilder("Beer is warm-");
    System.out.println(app);
    app.append('%');
    System.out.println("Result after appending = " + app);
  }
}
