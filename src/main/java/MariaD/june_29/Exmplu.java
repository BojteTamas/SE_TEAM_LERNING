package MariaD.june_29;

import java.util.*;

public class Exmplu {
  public static String litera(String litere) {
    litere += "A";
    litere += "c";
    litere += "v";
    return litere;
  }

  public static int numere(int numar) {
    numar = 5;
    numar++;
    return numar;
  }

  public static void main(String[] args) {
    int numar = 7; // /direct assignement
    String litere = "zxy"; // direct assignement
    numere(numar); // /apeleaza metoda
    litere = litera(litere); // apeleaza metoda
    System.out.println(numar + litere); // /7zxyAcv
  }
}
