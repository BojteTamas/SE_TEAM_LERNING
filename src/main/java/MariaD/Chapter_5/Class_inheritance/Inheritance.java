package MariaD.Chapter_5.Class_inheritance;

import java.util.*;

// base/parent  class

class Contractor {
  // clasa Contractor are 2 variabile
  public int ore;
  public int bani;
  // are un constructor
  public Contractor(int ore, int bani) {
    this.ore = ore;
    this.bani = bani;
  }

  // cream 3 metode
  public void NrMicOre(int descrestere) {
    ore -= descrestere;
  }

  public void NrMareOre(int crestere) {
    ore += crestere;
  }

  // aplicam metoda tostring
  public String toString() {
    return ("renumaratie/ora " + bani + "\n" + "numarul de ore este " + ore);
  }
}

// child class
class Antreprenor extends Contractor {
  public int proiect;

  // sublasa Antreprenor are 1 constructor
  public Antreprenor(int ore, int bani, int colaborare) {
    super(ore, bani);

    // folosim constructorii din super class
    proiect = colaborare;
  }

  // adaugam inca o metoda in subclasa
  public void proiect(int proiecte) {
    proiect = proiecte;
  }

  // overriding tostring() method ca sa printam mai multe info
  @Override
  public String toString() {
    return (super.toString() + " \nnumar de proiecte " + proiect);
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Antreprenor antreprenor = new Antreprenor(3, 100, 4);
    System.out.println(antreprenor.toString());
  }
}
/*
renumaratie/ora 100
numarul de ore este 3
numar de proiecte 4
 */
