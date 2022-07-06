package RalucaG.Exceptions;

public class ExceptionExamples {
  public int indexOf(String[] names, String name) {
    for (int i = 0; i < names.length; i++) {
      if (names[i].equals(name)) {
        return i;
      }
    }
    return -1;
  }
  /**
   * void explore() { try { //does not compile seeAnimals(); fall(); } catch (Exception e) {
   * getHugFromDaddy(); } finally { seeMoreAnimals(); } goHome(); }
   */
  public static void main(String[] args) throws Exception {
    String[] animals = new String[0];
    // System.out.println(animals[0]);//This code throws an ArrayIndexOutOfBoundsException.
    // throw new Exception("Oh no, something went wrong!");//this explicity request Java to throw an
    // exception
    // throw new RuntimeException("Oh no! Something went wrong!");// Subclass of RuntimeException;
    // program okay to catch, no need to handle
    // a try statement must have catch and/or finally!!!
    // for catch: the catch clauses attempts to catch it; it shows the type of the exception;
    // exception_type identifier => identifier refers to the caught exception object' type=> the
    // type of exception trying to catch
    // finally => the finally block always executes with or without exception occured in the try
    // block;
    String s = "";
    try {
      s += "t";
    } catch (Exception e) {
      s += "c";
    } finally {
      s += "f";
    }
    s += "a";
    System.out.println(s);

    int x = 245;
    int y = 0;
    try {
      System.out.println("x/y is: " + x / y);
    } catch (ArithmeticException e) {
      // e.printStackTrace(); // this method prints info in format of the name exception;description
      // of exception
      // System.out.println(e.toString());//this method prints info in format of the name
      // exceptions,description of exception
      // System.out.println(e.getMessage());//this method print the description of the exceptiuons
      // System.out.println(e.getCause());//this prints the cause, which is null
      System.out.println(
          e.getLocalizedMessage()); // this method print the description of the exceptiuons
    }
  }
}
