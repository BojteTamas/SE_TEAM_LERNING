package RalucaG.Exceptions;

public class DoSomething {
  public void go() {
    System.out.println("A");
    try {
      stop();
    } catch (ArithmeticException e) {
      System.out.println("B");
    } finally {
      System.out.println("C");
    }
    System.out.println("D");
  }

  public void stop() {
    System.out.println("E");
    Object x = null;
    x.toString();
    System.out.println("F");
  }

  public void start() {
    try {
      System.out.println("Starting up");
      throw new Exception();
    } catch (Exception e) {
      System.out.println("Problem");
      System.exit(0);
    } finally {
      System.out.println("Shutting down");
    }
  }

  public static void main(String[] args) {
    //  new DoSomething().go();
    new DoSomething().start();
  }
}
