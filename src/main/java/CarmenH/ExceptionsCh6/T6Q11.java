package CarmenH.ExceptionsCh6;

public class T6Q11 {
  public String name;

  public void parseName() {

    System.out.print("1");

    try {
      System.out.print("2");
      int x = Integer.parseInt(name);
      System.out.print("3");
    } catch (NullPointerException e) {
      System.out.print("4");
    }

    System.out.print("5");
  }

  public static void main(String[] args) {

    T6Q11 leo = new T6Q11();

    leo.name = "Leo";
    leo.parseName();
    System.out.print("6");
  }
}
// 12, followed by a stack trace for a NumberFormatException
