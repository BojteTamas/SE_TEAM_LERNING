package MariaD.may_june;

import java.util.*;

// stringbuilder + stringbuilder methods
// stringbuilder recap
/*public class Mariad6_june {
    public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder("animals");
    StringBuilder sb3 = new StringBuilder(10);
    //StringBuilder sb5 = sb3.append("antekd");
    //System.out.println(sb1);
   // System.out.println(sb2);
    System.out.println(sb3);
   // System.out.println("sb5=" + sb5);
    }
}
 */

// stringbuilder methods: char(At);indexOf(),length(); substring()
/*public class Mariad6_june {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));//output: anim//substring return first 4 digits
        int len = sb.length();//7//length return the no of characters in "animals"
        char ch = sb.charAt(6);//2//returns the character ar index 6//start from 0 when counting
        System.out.println(sub + " "+ len + " "+ ch); //anim 7 s
    }
}
 */

/*public class Mariad6_june {
    public static void main(String[] args) {
        StringBuilder am = new StringBuilder("vacationmode");
        String sub = am.substring(am.indexOf("v"), am.indexOf("mode"));//vacation
        int len = am.length();//12
        char ch = am.charAt(6);//o
        System.out.println(sub  + " " + len + " " + ch);//vacation 12 o

    }
}
 */
// append() method
/*public class Mariad6_june {
    public static void main(String[] args) {
        StringBuilder md = new StringBuilder().append(2).append('c').append("ice-cream");//2cice-cream
        md.append("-").append(false);
        System.out.println(md);//2cice-cream-false
    }
}
 */
// insert() method
/*public class Mariad6_june {
    public static void main(String[] args) {
        StringBuilder md = new StringBuilder("vacation");
        md.insert(4,"-");///md =vaca-tion
        md.insert(0,"-");///md =-vaca-tion
        md.insert(10,"-");//-vaca-tion-//daca pui 11, nu compileaza
        System.out.println(md);
    }
}
 */

// delete() & deleteChartAt() method
// delete() is the oposite of insert() => removes characters from the sequence
// deleteCharAt() convenient when you want to delete only 1 character
public class Mariad6_june {
  public static void main(String[] args) {
    StringBuilder md = new StringBuilder("vacationmode");
    md.delete(
        1,
        3); // md=vationmode//deleted ca. starts counting from 0. deletes starting with index1 up to
    // index3
    md.deleteCharAt(
        6); /// md = vationode deletes only the letter from index 6. starts counting from 0
    System.out.println(md);
  }
}
