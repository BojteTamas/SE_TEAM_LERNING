package CarmenH.ExceptionsCh6;

public class ExampleOfTryCatch1 {
  public static void main(String... args) {

    String s = "";

    try {
      s += "t"; // try block doesn't throw any exception so catch block is not run
    } catch (Exception e) {
      s += "c";
    } finally {
      s += "f";
    }

    s += "a";

    System.out.print(s); // tfa
  }
}
