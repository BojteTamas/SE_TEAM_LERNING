package MariaD;
import java.util.List;

//toLowerCase() and toUpperCase()
    //public static void main(String[] args) {
       // String string = "animals";
        //System.out.println(string.toUpperCase()); ///output ANIMALS
        //System.out.println(string.toLowerCase());// output animals

//equals() and equalsIgnoreCase()
//equals check whether 2 string objects contain exactly the same characters in the same orders
/*public class MariaD_1june {
    public static void main(String[] args) {
      //  System.out.println("abc".equals("ABC"));//FALSE
      // System.out.println("JDK".equals("JDK"));//TRUE
      //  System.out.println("lgn".equalsIgnoreCase("LGN"));//TRUE
    }
}
 */

//startsWith() and endsWith()
//!!! JAVA IS DOING A KEY SENSITIVE CHECK ON THE VALUES PROVIDED
/*public class MariaD_1june {
    public static void main(String[] args) {
        //System.out.println("mouse".startsWith("mo"));//true
        //System.out.println("paint".endsWith("t"));//true
    }
}
 */

//contains()
//!!! KEY SENSITIVE
/* public class MariaD_1june{
    public static void main(String[] args) {
        //System.out.println("computer".contains("mp")); //true
        System.out.println("bag".contains("A"));//false
    }
}
*/

//replace() --does a search and replace on the string
/*public class MariaD_1june {
    public static void main(String[] args) {
        System.out.println("macadamia".replace('a', 'A'));//mAcAdAmiA
        System.out.println("macadamia".replace("ada","UNT"));//macUNTmia
    }
}
 */

//trim() --removes whitespaces(spaces + tabs + newline characters)
//            from the begining & end of a string
public class MariaD_1june {
        public static void main(String[] args) {
            System.out.println("\t     starts sport   \n".trim());//starts sport
        }
}

