package MariaD.june_23;

import java.util.*;

public class Constructor1 {
  static class Muncitor {
    void Muncitor() {
      System.out.println("Muncitorul e aici");
    }
  }

  public static void main(String[] args) {
    Muncitor munca = new Muncitor();
    munca.Muncitor();
    System.out.println(munca); // //Muncitorul e aici
  }
}
