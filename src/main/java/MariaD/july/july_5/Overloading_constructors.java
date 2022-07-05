package MariaD.july.july_5;

import java.util.*;

/*
Rules:
It has the same name as the class
It should not return a value not even void
is technique in which a class can have any number of constructors that differ in parameter list.
The compiler differentiates these constructors by taking into account the number of parameters in the list and their type.
 */

class Demonstratie {
  int x;
  int y;
  String s;

  Demonstratie() {
    x = 18;
    y = 4000;
    s = "valoare";
    System.out.println("Constructori");
  }

  Demonstratie(int a) {
    x = a;
    System.out.println("Constructor 2");
  }

  Demonstratie(int a, String l) {
    x = a;
    y = x;
    s = l;
    System.out.println("Constructor 3");
  }

  public void afisaj() {
    System.out.println("x ===" + x);
    System.out.println("y ===" + y);
    System.out.println(s);
  }
}

public class Overloading_constructors {
  public static void main(String[] args) {
    Demonstratie d = new Demonstratie(); // Constructori
    Demonstratie d2 = new Demonstratie(30);
    Demonstratie d3 = new Demonstratie(30, "rechin");

    d.afisaj(); // x === 18  y === 40000
    d2.afisaj();
    d3.afisaj();
  }
}
/*
output Constructori
Constructor 2
Constructor 3
x ===18
y ===4000
valoare
x ===30
y ===0
null
x ===30
y ===30
rechin
 */
