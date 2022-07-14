package CarmenH.ExceptionsCh6;

public class PrintingAnException {
  public static void main(String[] args) {

    try {
      hop();
    } catch (Exception e) {
      System.out.println(
          e); // shows what Java prints out by default: the exception type and message
      System.out.println(e.getMessage()); // just the message
      e.printStackTrace(); // a stack trace
    }
  }

  private static void hop() {
    throw new RuntimeException("cannot hop");
  }
}
/**
 * this is an example for 3 types of printing an exception
 *
 * <p>1st: shows what Java prints out by default: the exception type and message
 * java.lang.RuntimeException: cannot hop
 *
 * <p>2nd: The second line shows just the message cannot hop
 *
 * <p>3rd: shows a stack trace. java.lang.RuntimeException: cannot hop at
 * CarmenH.ExceptionsCh6.PrintingAnException.hop(PrintingAnException.java:15) at
 * CarmenH.ExceptionsCh6.PrintingAnException.main(PrintingAnException.java:7)
 */
