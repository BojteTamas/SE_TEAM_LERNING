package CarmenH.ExceptionsCh6;

import java.io.FileReader;
import java.io.IOException;

public class Exception_Example_2ndThrow {
  public static void main(String[] args) {

    FileReader reader = null;
    try {
      reader = read();
    } catch (IOException e) {
      try {
        if (reader != null) // reader is null so the close() doesn't happen.
          // if (reader == null) // we reach close that throws an exception
          reader.close(); // this goes well, the main closes normally
        System.out.println("caught the IOExceptions and got to second try");
        System.out.println(reader);
      } catch (IOException inner) {
      }
    }
  }

  private static FileReader read() throws IOException {
    //  throw new NullPointerException(); //IOException is skipped
    throw new IOException();
  }

  private static FileReader close() throws IOException {
    //  throw new NullPointerException(); //IOException is skipped
    throw new IOException();
  }
}
