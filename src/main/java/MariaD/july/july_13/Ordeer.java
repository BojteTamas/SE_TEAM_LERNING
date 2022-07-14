package MariaD.july.july_13;

import java.util.*;

public class Ordeer {
  String value = "t";

  {
    value += "a";
  }

  {
    value += "c";
  }

  public Ordeer() {
    value += "b";
  }

  public Ordeer(String s) {
    value += s;
  }

  public static void main(String[] args) {
    Ordeer order = new Ordeer("F");
    order = new Ordeer();

    System.out.println(order.value); // /tacb
  }
}
