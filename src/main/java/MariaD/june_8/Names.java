package MariaD.june_8;

import java.util.*;

public class Names {
  public static void main(String[] args) {
    String names[] = new String[2]; // it has 2 elements because the length is 2
    String[] strings = {"string value"};
    Object[] objects = strings;
    // String againStrings = (String[]) objects;
    // againStrings[0] = new StringBuilder();
    // objects[0] = new StringBuilder();
    //  System.out.println(againStrings);
    System.out.println(objects[0]); // /output string value
  }
}
