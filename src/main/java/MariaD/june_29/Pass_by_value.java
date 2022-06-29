package MariaD.june_29;

import java.util.*;

/*
Java:  “pass-by-value” language: a copy of the variable is made and the method receives that copy.
Assignments made in the method do not affect the caller.
 */

public class Pass_by_value {
  public static void numere(int numar) {
    numar = 8;
  }

  public static void main(String[] args) {
    int numar =
        4; /// valoare asignata 4, desi se foloseste acelasi nume ca si in linia 11, se ia valoarea
    // asignata in metoda static void main
    numere(6); // /se apeleaza metoda numere
    System.out.println(numar); // 4
  }
}
