package MariaD.may_june;
import java.util.*;

//method chaining
/*public class Mariad_2june {
    public static void main(String[] args) {
        String start = "animal";
        String trimmed = start.trim();
        String lowercase = trimmed.toLowerCase();
        String result = lowercase.replace('a','A');
        System.out.println(result);//output AnimAl

    }
}
*/
/*//trim cuts/removes the whitespaces
public class Mariad_2june {
    public static void main(String[] args) {
        String start = "vaseline";
        String trimmed = start.trim();
        System.out.println(start.trim());
    }
}
*/
/*public class Mariad_2june {
    public static void main(String[] args) {
        String a = "abc";
        String b = a.toUpperCase();//ABC
        b = b.replace("B", "2").replace('C', '3');//A23
        System.out.println("a=" + a);//a = abc, deoarece am printat string a
        System.out.println("b=" + b);//b=A23, am dat print la string b
    }
}
 */
//StringBuilderClass
/* public class Mariad_2june {
    public static void main(String[] args) {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);//abcdefghijklmnopqrstuvwxyz
    }
}
 *///append =  mainly used to append or add data in a file.
// You can add characters, Booleans, string, integer, float, etc., to the data in a program
//
/*public class Mariad_2june {
    public static void main(String[] args) {
        StringBuilder alpha = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);//abcdefghijklmnopqrstuvwxyz
    }
}
 */
        public class Mariad_2june {
            public static void main(String[] args) {
                StringBuilder sb = new StringBuilder("start");
                sb.append("middle"); //sb = start + middle
                StringBuilder same = sb.append("end"); //same =startmiddle + end
               // System.out.println(sb);///startmiddle
                String nu = "abc";
                String nuli = nu + "amwmas";
                nu = nu + "DA";

                System.out.println(nu+ "def");//abcdef
                System.out.println(nu);//abc
                System.out.println(nuli);//abcamwmas
                //System.out.println(same);//startmiddleend
                //de ce ambele outpuri sunt startmiddleend?
            }
    }
