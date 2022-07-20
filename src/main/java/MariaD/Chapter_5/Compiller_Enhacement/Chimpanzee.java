package MariaD.Chapter_5.Compiller_Enhacement;

import java.util.*;

class Primate {
  public Primate() {
    System.out.println("Primate");
  }
}

class Ape extends Primate {
  public Ape() {
    System.out.println("ape");
  }
}

public class Chimpanzee extends Ape {
  public static void main(String... args) {
    new Chimpanzee(); // Primate       ape
  }
}
// the compiler FIRST inserts super() comand as the first statement for both Primate & Ape
// compiler inserts a deefault non-argumenet constructor in Chimpanzee with super() as first
// statement
