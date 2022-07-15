package MariaD.july.july_13;

import java.util.*;

class Order4 {
  // public static void main(String...args){
  final String value1 = "1";
  static String value2 = "2";
  String value3 = "3";

  {
    // value2 = " 2";
    value3 = "f";
  }

  static {
    value2 = "h";
  }
}

public class Order3 {
  public static void main(String... args) {
    Order4 order = new Order4();
  }
}
