package MariaD.july.july_13;

import java.util.*;

public class StringBuilder_work {
  public static StringBuilder work(StringBuilder a, StringBuilder b) {
    a = new StringBuilder("a");
    b.append("b");
    return a;
  }

  public static void main(String[] args) {
    StringBuilder s1 = new StringBuilder("s1");
    // constructor StringBuilder_work in class MariaD.july.july_13.StringBuilder_work
    // cannot be applied to given types;
    StringBuilder s2 = new StringBuilder("s2");
    StringBuilder s3 = work(s1, s2); //

    System.out.println("s1 = " + s1); // s1 = s1
    System.out.println("s2 = " + s2); // s2 = s2b
    System.out.println("s3 = " + s3); // s3 = s3 = a
  }
}
