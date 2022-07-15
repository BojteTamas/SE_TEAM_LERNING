package MariaD.july.july_13;

import java.util.*;

interface Secret {
  String magic(double d);
}

class MySecret1 implements Secret {
  public String magic(double d) {
    return "Proof";
  }
}

public class MySecret {
  public static void main(String[] args) {
    MySecret1 secret = new MySecret1();
    System.out.println(secret);
  }
}
/*
Which lambda can replace
the MySecret class to return the same value? (Choose all that apply):
A. caller((e) -> "Poof");
E.E. caller((e) -> { caller((e) -> { String e = " ; return Proof;}))
 */
