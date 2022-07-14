package CarmenH.ExceptionsCh6;

import java.io.IOException;

public class BadExampleOfSwallowing {

  public static void main(String[] args) {

    String textInFile = null;

    try {
      readInFile();
    } catch (IOException e) {
      // ignore exception
      System.out.println("FILE MISSING!!!!");
      System.out.println(e);
      e.printStackTrace();
    }
    // imagine many lines of code here
    System.out.println(textInFile.replace(" ", ""));
  }

  private static void readInFile() throws IOException {

    throw new IOException();
  }
}
/**
 * we get here java.lang.NullPointerException because space " " is not found but we really do not
 * have the file we should have got a message to know that
 */
