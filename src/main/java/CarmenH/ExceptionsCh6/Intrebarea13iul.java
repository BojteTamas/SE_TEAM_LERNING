package CarmenH.ExceptionsCh6;

public class Intrebarea13iul {
  String name;

  public void printLength() throws NullPointerException {
    System.out.println(name.length());
  }

  public static void main(String... args) {
    Intrebarea13iul bbb = new Intrebarea13iul();
    bbb.printLength();
  }
}
