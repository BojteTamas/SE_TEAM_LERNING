package MariaD.july.july_7;

import java.util.*;

public class Chaining_2 {
  int pix;
  String stilou;
  int creion;

  public Chaining_2(String stilou) {
    this(3, 9); // apeleaza un constructor cu 2 parametrii
  } //// imi ia stringul declarat mai jos "roz"//output //3 9 roz, hmmm investigheaza

  public Chaining_2(int creion, int pix) {
    this(creion, pix, "roz"); // apeleaza un constructor cu 3 parametrii
  }

  public Chaining_2(int creion, int pix, String stilou) {
    this.creion = creion;
    this.pix = pix;
    this.stilou = stilou;
  }

  public void print() {
    System.out.println(creion + " " + pix + " " + stilou);
    System.out.println();
  }

  public static void main(String... args) {
    Chaining_2 clasa = new Chaining_2(2, 8, "albastru");
    Chaining_2 c1 = new Chaining_2("rosu");
    Chaining_2 c2 = new Chaining_2(2, 3);
    clasa.print(); // 2 8 albastru
    c1.print(); // 3 9 roz
    c2.print(); // 2 3 roz
  }
}
