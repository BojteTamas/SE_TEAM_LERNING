package MariaD.july.july_7;

import java.util.*;

/*
rules:
1.If there is a superclass, initialize it first
2.static variable declarations and static initializers in the order they appear in the file
3.Instance variable declarations and instance initializers in the order they appear in the file.
4.constructors.
 */

public class Initialization {
  private String scoala = "Lucian Blaga";

  {
    System.out.println(scoala);
  }

  private static int numere = 8;

  static {
    System.out.println(numere);
  }

  static {
    numere += 10;
    System.out.println(numere);
  }

  public Initialization() {
    System.out.println("constructor");
  }

  public static void main(String... args) {
    Initialization init = new Initialization();
    /*
    s-a initializat mai intai  private static int (numerele 8 & 18)(regula 2 static variables & initializers)
     dupa aia s-a initializat  private String, care intra in categoria instance variable declarations & initializers
     s-a initializat constructorul, ultimmul in ordinea initializarii
     */
  }
}
