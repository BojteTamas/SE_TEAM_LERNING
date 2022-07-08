package MariaD.july.july_8;

import java.util.*;

class Echipamente {
  // declaram domeniile private
  private int numeree; // /declaram int-ul privat
  private String echipamente; // declaram Stringul privat
  private boolean tastatura; // declaram boolean privat

  // declaram getter getNume(), getNume e folosit doar pt int si String --care e public
  public int getNumere() {
    return numeree;
  }

  public String getEchipament() {
    return echipamente;
  }
  // pentru boolean type, getterul se declara cu isNume
  public boolean isTastatura() {
    return tastatura;
  }
  // declaram setter setNume()--se declara cu set pt toate tipurile ;care e public
  public void setTastatura(boolean tastatura) {
    this.tastatura = tastatura;
  }

  public void setNumere(int numere) {
    if (numeree < 1) this.numeree = numere; // /adaugam o conditie pe numere setter
  }

  public void setEchipament(String echipamente) {
    this.echipamente = echipamente;
  }
}

public class Encapsulation2 {
  public static void main(String... args) {
    Echipamente echi = new Echipamente();
    echi.setNumere(2);
    echi.setEchipament("LAPTOPURI");
    echi.setTastatura(true);
    System.out.println("numar" + " " + echi.getNumere()); // numar 2
    System.out.println("tip echipament" + " " + echi.getEchipament()); // tip echipament LAPTOPURI
    System.out.println("are si tastatura" + " " + echi.isTastatura()); // are si tastatura false
  }
}
