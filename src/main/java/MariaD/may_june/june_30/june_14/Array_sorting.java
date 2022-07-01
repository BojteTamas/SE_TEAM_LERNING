package MariaD.may_june.june_30.june_14;

import java.util.ArrayList;
import java.util.Collections;

// sorting arrays--sorteaza elementele unui array, atat litere(ordine alfabetica) cat si numere
/*public class Array_sorting {
    public static void main(String[] args){
        ArrayList<Integer> numere = new ArrayList<>();
        numere.add(100);
        numere.add(46);
        numere.add(13);
        numere.add(5);
        Collections.sort(numere);
        System.out.println(numere);//[5,13,46,100]
    }
}
 */
public class Array_sorting {
  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
    lista.add("a");
    lista.add("c");
    lista.add("m");
    lista.add("b");
    Collections.sort(lista);
    System.out.println(lista); // [a,b,c,m]
  }
}
