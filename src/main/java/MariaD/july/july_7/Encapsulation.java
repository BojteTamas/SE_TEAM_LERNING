package MariaD.july.july_7;

import java.util.*;

/*
Encapsulation is one of the four fundamental OOP concepts.
The other three are inheritance, polymorphism, and abstraction.
Encapsulation in Java is a mechanism of wrapping the data (variables)
    and code acting on the data (methods) together as a single unit
also known as data hiding.
To achieve encapsulation in Java

1. Declare the variables of a class as private.
2.Provide public setter and getter methods to modify and view the variables values.
 */

class Elev {
  private String numee;
  private String prenumee;

  // Getter methods
  public String getNume() {
    return numee;
  }

  public String getPrenume() {
    return prenumee;
  }

  // setter methods
  public void setNume(String nume) {
    this.numee = nume;
  }

  public void setPrenume(String prenume) {
    this.prenumee = prenume;
  }
}

public class Encapsulation {
  public static void main(String... args) {
    Elev e = new Elev();
    e.setNume("Matesan");
    e.setPrenume("Cristian");
    System.out.println("Nume:" + " " + e.getNume()); // Nume: Matesan
    System.out.println("Prenume:" + " " + e.getPrenume()); // Prenume: Cristian
  }
}
