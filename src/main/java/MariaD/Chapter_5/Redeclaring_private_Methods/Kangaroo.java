package MariaD.Chapter_5.Redeclaring_private_Methods;
import java.util.*;
class Marsupial{
     public static boolean isBiped() {
        return false;
    }
    public void getDescription(){
        System.out.println("marsupial walks on 2 legs: " + isBiped());
    }
}
public class Kangaroo extends Marsupial {
    public static boolean isBiped() {
        return true;
    }
    public void getKangarooDescription(){
        System.out.println("kangaroo hops on 2 legs " +isBiped());
    }
    public static void main(String[] args){
        Kangaroo jim = new Kangaroo();
        jim.getDescription();//marsupial walks on 2 legs: false
        jim.getKangarooDescription();//kangaroo hops on 2 legs true
    }
}
