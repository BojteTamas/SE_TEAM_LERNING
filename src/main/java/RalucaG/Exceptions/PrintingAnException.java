package RalucaG.Exceptions;

import CalinA.OCA8.OCA06.IOException;

public class PrintingAnException {
  public static void main(String[] args) {
    try {
      hop();
    } catch (Exception e) {
      System.out.println(e); // shows what java prints out by default: exception type + message
      // System.out.println(e.getMessage());//shows just the message
      // e.printStackTrace();;// stack trace -> where the exception occuere in each method that it
      // passed through
    }

    String textInFile =
        null; // Exception in thread "main" java.lang.NullPointerException: Cannot invoke
    // "String.replace(java.lang.CharSequence, java.lang.CharSequence)" because
    // "textInFile" is null at
    // RalucaG.Exceptions.PrintingAnException.main(PrintingAnException.java:23)
    // String textInFile = "Something defined here .....'' "; this compiles, no exception and does
    // the replace in the text
    try {
      readInFile();
    } catch (IOException e) {
      System.out.println("ignore exception");
    }
    // something something code
    System.out.println(textInFile.replace(" ", ""));
  }

  private static void readInFile() throws IOException {
    throw new IOException();
  }

  private static void hop() {
    throw new RuntimeException("cannot hop");
  }
}
