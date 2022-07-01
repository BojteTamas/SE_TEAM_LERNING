package MariaD.july.july_1;

import java.io.*;
import java.util.*;

public class Autoboxing_2 {
  public void fluture(String a) {
    System.out.println("string");
  }

  public void fluture(Object o) {
    System.out.println("obiect");
  }

  public void fluture(Integer i) {
    System.out.println("integer");
  }

  public static void main(String[] args) {
    Autoboxing_2 auto = new Autoboxing_2();
    auto.fluture("omleta"); // string
    // auto.fluture();
    auto.fluture(2); // integer
  }
}
