package MariaD.june_17;

import java.util.*;


///Q15
/*public class Test_2 {
    public static void main(String[] args) {
        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
        String beans[] = new beans[6];
        java.util.Date[] dates[] = new java.util.Date[2][];
        int[][] types = new int[];
        int[][] java = new int[][];
        char[]c = new char[2];
        ///int length = c.size(); illegal
       // int length = c.size; ILLEGAL
       //int length = c.length();
        //int length = c.length;
        //int length = c.capacity(); ILLEGAL
       /// int length = c.capacity; Illegal
    }
}
 */

///Q14 -> A. puzzle.reverse();
/*public class Test_2 {
    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder("Java");
        puzzle.reverse();
        System.out.println(puzzle);///avaJ
    }
}
 */

/// Q13 F. The code does not compile.
/*public class Test_2 {
  public static void main(String[] args) {
    StringBuilder b = "rumble";
    b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
    System.out.println(b);///java: incompatible types: java.lang.String cannot be converted to java.lang.StringBuilder
  }
}
 */

// Q12
/*public class Test_2 {
  public static void main(String[] args) {
    StringBuilder numbers = new StringBuilder("0123456789");
    numbers.delete(2, 8);
    numbers.append("-").insert(2, "+");
    System.out.println(numbers);/////01+89-
  }
}
 */

/// Q11 -> E. An exception is thrown.
/*public class Test_2 {
  public static void main(String[] args) {
    int total = 0;
    StringBuilder letters = new StringBuilder("abcdefg");
    total += letters.substring(1, 2).length();
    total += letters.substring(6, 6).length();
    total += letters.substring(6, 5).length();
    System.out.println(total);////Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
  }
}
 */

// Q10   ----> F.equals
/*public class Test_2 {
  public static void main(String[] args) {
    String a = "";
    a += 2;
    a += 'c';
    a += false;
    if (a == "2cfalse") System.out.println("==");
    if (a.equals("2cfalse")) System.out.println("equals"); // /equals
  }
}
 */

// Q9 ----> C. 8
/*public class Test_2 {
  public static void main(String[] args) {
    String s = "purr";
    s.toUpperCase();
    s.trim();
    s.substring(1, 3);
    s += " two";
    System.out.println(s.length());//8
  }
}
 */

//// q8 -> 12, 78
/*public class Test_2 {
    public static void main(String[] args){
        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7));///12 , 78
    }
}
 */
