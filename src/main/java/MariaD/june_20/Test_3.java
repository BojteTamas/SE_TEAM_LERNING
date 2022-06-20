package MariaD.june_20;

import java.util.*;
import java.util.ArrayList.*;

// Q21
public class Test_3 {
  public static void main(String[] args) {
    ArrayList<Integer> values = new ArrayList<>();
    values.add(4);
    values.add(5);
    values.set(1, 6);
    values.remove(0);
    for (Integer v : values) System.out.print(v); // 6
  }
}

// Q20 -> Compiler error on line 9.
/*public class Test_3 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add(7);
    for (String s : list) System.out.print(s);
  }
}
 */

// Q14 -> A. puzzle.reverse();
/*public class Test_3 {
  public static void main(String[] args) {
    StringBuilder puzzle = new StringBuilder("Java");
    puzzle.reverse();
    System.out.println(puzzle); // /avaJ
  }
}
 */

// Q13  -> E. An exception is thrown.
/*public class Test_3 {
  public static void main(String[] args) {
    StringBuilder b = "rumble";
    b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
    System.out.println(b);//String cannot be converted to java.lang.StringBuilder
  }
}
 */
// Q12-->A. 01+89–
/*public class Test_3 {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8);
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);//01+89-
    }
}
 */

// Q11 -> E. An exception is thrown.
/*public class Test_3 {
  public static void main(String[] args) {
    int total = 0;
    StringBuilder letters = new StringBuilder("abcdefg");
    total += letters.substring(1, 2).length();
    total += letters.substring(6, 6).length();
    total += letters.substring(6, 5).length();
    System.out.println(total);//String index out of range: -1
  }
}
 */

// q10--->F.EQUALS
/*public class Test_3 {
  public static void main(String[] args) {
    String a = "";
    a += 2;
    a += 'c';
    a += false;
    if (a == "2cfalse") System.out.println("==");
    if (a.equals("2cfalse")) System.out.println("equals");//equals
  }
}
 */
