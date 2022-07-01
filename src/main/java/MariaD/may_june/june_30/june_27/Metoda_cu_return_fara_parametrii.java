package MariaD.may_june.june_30.june_27;

/*
metoda produs returnează o valoare de tip întreg.
Orice metodă care are o valoare de returnare ar trebui să aibă declarație de returnare cu valoarea care trebuie returnată.
În acest caz, variabila produs este valoarea returnată. În mod similar, în timp ce invocăm o metodă cu tipul returnat,
trebuie să avem o variabilă de același tip care primește funcția de ieșire.
De aceea folosim int prod = m.multiply().
 */
public class Metoda_cu_return_fara_parametrii {
  int produs, x, y;

  Metoda_cu_return_fara_parametrii(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int inmultire() {
    produs = x * y;
    return produs;
  }

  public static void main(String[] args) {
    Metoda_cu_return_fara_parametrii metoda = new Metoda_cu_return_fara_parametrii(2, 8);
    int prod = metoda.inmultire();
    System.out.println("Produsul este: " + prod); // /Produsul este: 16
  }
}
