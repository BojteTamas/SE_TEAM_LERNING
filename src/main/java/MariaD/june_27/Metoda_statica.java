package MariaD.june_27;

import java.util.*;

/*
putem folosi static cuvânt cheie pentru metode.
În acest caz, nu avem nevoie de niciun obiect de clasă pentru a invoca metoda statică
și putem apela folosind numele metodei direct.
 */

public class Metoda_statica {
  public static void add() {
    System.out.println("Metoda statica adauga");
  }

  public static void main(String[] args) {
    add(); // Metoda statica adauga
  }
}
