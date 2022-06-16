package MariaD.june_16;

import java.util.*;

// Q7
public class Test {
  public static void main(String[] args) {
    String letter = "abcdef";
    System.out.println((letter.length()));
    System.out.println(letter.charAt(3));
    System.out.println(letter.charAt(6)); // /throws exception
  }
}

// Q6 -> A.roar roar!!!
/*public class Test{
    public void mormait(String mormait1, StringBuilder mormait2){
        mormait1.concat("!!!");
        mormait2.append("!!!");
    }
    public static void main(String[] args){
        String mormait1 = "mormait";
        StringBuilder mormait2 = new StringBuilder("mormait");
        new Test().mormait(mormait1, mormait2);
        System.out.println(mormait1 + " " + mormait2);////mormait mormait!!!
    }
}
 */

// Q5 => The code does not compile.
/*public class Test{
    public static void main(String[] args){
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        if (s1 == s2) ///line do not compile. cannot use == when you compare a string with a stringbuilder
            System.out.println("1");
        if(s1.equals(s2))
            System.out.println("2");
    }
}
 */

// Q4 -> B.abbaccca
/*public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bbb").insert(4,"ccc");
        System.out.println(sb);///abbbcccaa
    }
}
 */

// q3
// B. An immutable object cannot be modified.
// E. String is immutable.

// Q2 > C. three
/*public class Test {
  public static void main(String[] args) {
    String s = "hello";
    String T = new String(s);
    if ("Hello".equals(s)) System.out.println("one");
    if (T == s) System.out.println("two");
    if (T.equals(s)) System.out.println("three"); // //corect answer
    if ("Hello" == s) System.out.println("four");
    if ("Hello" == T) System.out.println("five");
  }
}
 */

// q1
/*public class Test {
    public static void main(String[] args){
        int numFish = 4;
        String fishType = "tuna";
        String anotherFish = numFish + 1;///this line does not compile, INT CANNOT BE CONVERTED TO STRING
        System.out.println(anotherFish + "" + fishType);
        System.out.println(numFish + "" + 1);
    }
}
 */
