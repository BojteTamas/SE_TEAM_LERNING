package MariaD.may_june.june_30.june_27;

public class Metoda_fara_parametru_si_fara_return {
  int x, y; // / intializam variabile x, y ca si constructori, care vor fi utilizati direct in cadru
  // metodei add()

  Metoda_fara_parametru_si_fara_return(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void add() { // metoda cu paranteze () ->  metoda fara parametru si fara tip de returnare
    int sum = x + y;
    System.out.println("sum is" + sum);
  }

  public static void main(String[] args) {
    Metoda_fara_parametru_si_fara_return metoda =
        new Metoda_fara_parametru_si_fara_return(1, 5); // /sum is 6
    metoda.add();
  }
}
