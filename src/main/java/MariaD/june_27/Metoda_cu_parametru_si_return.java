package MariaD.june_27;

import java.util.*;

/*
metoda mai_mare are ambii parametri și valoare returnată.
-> atunci când apelăm metoda, ar trebui să trecem argumente,
    precum și să avem o variabilă pentru a atribui valoarea returnată din metodă.
x și y valori atribuite returnează variabila max din metoda.
valoarea variabila primește rezultatul acestei metode.
 */
public class Metoda_cu_parametru_si_return {
  int max;

  public int mai_mare(int x, int y) {
    if (x > y) max = x;
    else max = y;

    return max;
  }

  public static void main(String[] args) {
    Metoda_cu_parametru_si_return comparatie = new Metoda_cu_parametru_si_return();
    int valoare = comparatie.mai_mare(135, 47);
    System.out.println("Cea mai mai valoare e: " + valoare);
  }
}
