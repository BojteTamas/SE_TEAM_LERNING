package MariaD;
import java.util.*;

//StringBuilder methods
//reverse()
/*public class MariaD_7june {
    public static void main(String[] args) {
        StringBuilder md = new StringBuilder("MATHS");
        md.reverse();
        System.out.println(md);///output: SHTAM----REVERSE THE LETTHERS FROM THE WORD
    }
}
 */

//toString();----converts a Stringbuilder into a STRING
//StringBuilder is used internally for performance purposes, but the end result needs to be a string!!!!
/*public class MariaD_7june {
    public static void main(String[] args) {
        StringBuilder md = new StringBuilder("MATHS");
        String s = md.toString();
        System.out.println(s);
    }
}

 */
//StringBuilder vs StringBuffer --they do the same thing, but StringBuffer does it more slowly because it is thread safe

//Understanding equality
/*public class MariaD_7june {
    public static void main(String[] args) {
        StringBuilder md1 = new StringBuilder();
        StringBuilder md2 = new StringBuilder();
        StringBuilder md3 = md1.append("a");
        System.out.println(md1==md2);//false..md1, md2 => 2 separate objects
        System.out.println(md1 == md3);//true, md1 & md3=> same object
    }
}
 */
/*public class MariaD_7june {
    public static void main(String[] args) {
        String a = "Hello World";
        String b = "Hello World";
        System.out.println(a==b);//true  JVM CREATES ONLY ONE LOCATION IN MEMORY AS "HELLO WORLD", THAT'S WHY A==B
    }
}
 */
/*public class MariaD_7june {
    public static void main(String[] args) {
        String a = "hello world";
        String b = "hello world".trim();//hello world
        System.out.println(b);
        System.out.println(a==b);//true
        }
    }
 */
public class MariaD_7june {
    public static void main(String[] args) {
        String x = new String("Hello World");
        String y = "Hello World";
        System.out.println(x == y);//false
    }
}









