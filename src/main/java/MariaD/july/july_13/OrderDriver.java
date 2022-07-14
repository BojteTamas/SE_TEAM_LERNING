package MariaD.july.july_13;

import java.util.*;

class Order1 {
  static String result = "";

  {
    result += "c";
  }

  static {
    result += "u";
    result += "r";
  }
}

public class OrderDriver {
  public static void main(String[] args) {

    System.out.print(Order1.result + " ");
    System.out.print(Order1.result + " ");

    new Order1();
    new Order1();

    System.out.print(Order1.result + " "); // ur ur urcc
  }
}
