package MariaD.may_june.june_30.june_28;

/*
Metode care sunt non-static și care aparține unei clase se numește an instance metodă.
Aceste metode necesită un obiect sau o instanță de clasă pentru a efectua un apel către funcție.
Acest lucru este în contrast cu metodele statice care nu necesită niciun obiect.
 */

public class Non_static_method {
  public static void metoda_statica() {
    System.out.println("Aceasta e metoda static");
  }

  public void instance_method() {
    System.out.println("aceasta e metoda non static/ intance method");
  }

  public static void main(String[] args) {
    Non_static_method metoda = new Non_static_method();

    // apelam metoda static, nu are nevoie de o clasa pt a putea fi apelata
    metoda_statica(); // Aceasta e metoda static

    // apelam instance method, are nevoie de o clasa pentru a o putea apela
    metoda.instance_method(); // aceasta e metoda non static/ intance method
  }
}
