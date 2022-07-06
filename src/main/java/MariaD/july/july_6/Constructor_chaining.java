package MariaD.july.july_6;

import java.util.*;

public class Constructor_chaining {
  String scoala;
  int elevi;
  String profesori;

  public Constructor_chaining(int elevi) {
    this("Vivat Academia", elevi);
  }

  public Constructor_chaining(String scoala, int elevi) {
    this(scoala, elevi, "profesori");
  }

  public Constructor_chaining(String scoala, int elevi, String profesori) {
    this.scoala = scoala;
    this.elevi = elevi;
    this.profesori = profesori;
  }

  public void print() {
    System.out.println(scoala + " " + elevi + " " + profesori);
    System.out.println();
  }

  public static void main(String[] args) {
    Constructor_chaining exemple =
        new Constructor_chaining("Scoala L Blaga", 17, " profesori buni");
    Constructor_chaining exemplu2 = new Constructor_chaining("Mihai Eminescu", 13);
    Constructor_chaining ex3 = new Constructor_chaining(15);
    ex3.print(); // Vivat Academia 15 profesori
    exemplu2.print(); // scoala 16 profesori
    exemple.print(); // Scoala L Blaga 17  profesori buni
  }
}
