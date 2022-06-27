package MariaD.june_27;

import java.util.*;

public class Metoda_cu_parametrii_fara_return {
  public void parametrii(
      int x, int y) { // /are parametrii setati intre (), accepta 2 parametrii de tip int
    int diferenta = x - y;
    System.out.println("Diferenta este " + diferenta);
  }

  public static void main(String[] args) {
    Metoda_cu_parametrii_fara_return metoda = new Metoda_cu_parametrii_fara_return();
    metoda.parametrii(20, 5);
  }
}

/*Principala diferență între variabilele de clasă și
variabilele parametrilor este că variabilele de clasă pot fi
utilizate în întreaga clasă, unde variabilele de parametru pot fi utilizate numai în cadrul metodei.
 */
