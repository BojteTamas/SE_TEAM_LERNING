package MariaD.july.july_7;

import java.util.*;

public class Initializare2 { // /instance variable ruleaza a 3-a

  private String scoala = "Lucian Blaga"; // /instance variable ruleaza a 3-a

  {
    System.out.println(scoala);
  }

  public static int numere = 9; // //asta e static initializer -> ruleaza primul

  static {
    System.out.print(numere);
  }

  static {
    numere++;
    System.out.println(numere);
  }

  public Initializare2() { // constructors. ruleaza al 4-lea
    System.out.println("constructor");
  }

  public static void main(String... args) { // //static variable declarations
    System.out.println("iNITIALIZARE COMPLEXA"); // /ruleaza a doua
    new Initializare2();
  }

  /*
  9 10 - cele 2 numere din public statc int
  iNITIALIZARE COMPLEXA ---printul din static void main , cele 2 ruleaza in ordinea in care apar in cod
  Lucian Blaga---instance variable
  constructor--constructor
       */
}
