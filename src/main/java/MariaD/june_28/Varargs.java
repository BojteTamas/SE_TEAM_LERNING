package MariaD.june_28;

import java.util.*;

/*
Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments.
Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.
 */

public class Varargs {
  //// IA string ca si argument urmat de varargs
  public static void distractie(String incepe, int... numere) {
    System.out.println("acuma e acuma " + incepe);
    System.out.println(numere.length);
    // folosim fiecare loo pentru a afisa elementele "numere"
    for (int i : numere) System.out.println(i + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    distractie("Maria", 100, 200); // //acuma e acuma Maria 2, 100m 200
    distractie("Pricepe", 1, 2, 3, 4); // acuma e acuma Pricepe 4,1,2,3,4
    distractie("sau asa si asa"); // acuma e acuma sau asa si asa 0
  }
}
