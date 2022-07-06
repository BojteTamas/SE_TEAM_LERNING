package MariaD.july.july_6;

import java.util.*;

/*
copy constructor = un constructor care ia ca parametru un obiect de același tip cu clasa în care se află constructorul respectiv
copiem obiecte, prin copierea membru cu membru în constructor.
 */
class Elev {
  private String nume;
  public int medie;

  public Elev(String nume, int nota) {
    this.nume = nume;
    this.medie = nota;
  }

  public Elev(Elev elev) {
    this.nume = elev.nume;
    this.medie = elev.medie;
  }

  public void print() {
    System.out.print(nume);
    System.out.println(medie);
  }
}

public class Copy_constructor {
  public static void main(String[] args) {
    Elev e0 = new Elev("Vasilica", 8);
    Elev e1 = new Elev("Ionut", 7);
    Elev e2 = new Elev("Maria", 4);
    e1 = e0;
    e0.medie = 9; // /inlocuim nota
    e0.print(); // Vasilica9
    e1.print(); // Vasilica9
    e2.print(); // maria4
  }
}
/*e0, 01 sunt referinte catre acelasi obiect din memorie.
orice modificare facuta asupra uneia dintre referinte va fi vizibila si asupra celeilalte referinte

 */
