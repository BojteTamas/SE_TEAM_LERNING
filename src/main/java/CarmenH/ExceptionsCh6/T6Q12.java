package CarmenH.ExceptionsCh6;

public class T6Q12 {
  public String name;

  public void run() {
    System.out.print("1");
    try {
      System.out.print("2");
      name.toString();
      System.out.print("3");
    } catch (NullPointerException e) {
      System.out.print("4");
      throw e; // this is an uncaught exception - this si why 5 is never printed
    }
    System.out.print("5");
  }

  public static void main(String[] args) {
    T6Q12 jerry = new T6Q12();
    jerry.run();
    System.out.print("6");
  }
}
