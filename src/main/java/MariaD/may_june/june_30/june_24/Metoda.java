package MariaD.may_june.june_30.june_24;

public class Metoda {
  public static int functie(int n1, int n2) {
    int minim;
    if (n1 > n2) minim = n2;
    else minim = n1;
    return minim;
  }

  public static void main(String[] args) {
    int a = 11;
    int b = 6;
    int c = functie(a, b);
    System.out.println("Valoare minima = " + c); // /Valoare minima = 6
  }
}
