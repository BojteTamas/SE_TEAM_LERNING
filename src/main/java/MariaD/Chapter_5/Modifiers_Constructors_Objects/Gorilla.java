package MariaD.Chapter_5.Modifiers_Constructors_Objects;

import java.util.*;

class Animal {
  private int age;
  private String name;

  public Animal(int age, String name) {
    super();
    this.age = age;
    this.name = name;
  }

  public Animal(int age) {
    super();
    this.age = age;
    this.name = null;
  }
}

class Gorilazz extends Animal {
  public Gorilazz(int age) {
    super(age, "Gorillazz");
  }

  public Gorilazz() {
    super(5);
  }
}

public class Gorilla {
  public static void main(String[] args) {
    Gorilazz g = new Gorilazz();
    System.out.println(g);
  }
}
