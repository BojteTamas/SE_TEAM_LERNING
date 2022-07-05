package MariaD.july.july_4;

import java.util.*;

/// se face autoboxing
public class Reference_type {
  public void fluture(String aripa) {
    System.out.println("string");
  }

  public void fluture(Object i) {
    System.out.println("int type");
  }

  public static void main(String[] args) {
    Reference_type referinta = new Reference_type();
    referinta.fluture("test"); // string
    referinta.fluture(1); // int type
  }
}
// raspunsul corect ar trebui sa fie string, de ce se face autoboxing?
