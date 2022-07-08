package MariaD.july.july_8;

import java.util.*;

/*
String is an immutable class
an immutable class cannot be changed at all
an immutable class will always be the same
helps programs easier to maintain
you ommit the setters when building an immutable class

steps:
1. declare the class as final so it cannot be extended
2. all class members should be private so they cannot be accessed outside of class
3. shouldn't contain any setter methods to change the value of class members
4. the getter method should return the copy of class members
5. class members are only initialized using constructor
 */
// class is declared as final
final class Immutable {
  // declaring private string members
  private String nume;
  private int data;

  Immutable(String nume, int data) {
    // class members are initialized using constructor
    this.nume = nume;
    this.data = data;
  }
  // getter method returns the copy of class members
  public String getNume() {
    return nume;
  }

  public int getData() {
    return data;
  }
}

public class ImmutableClass {
  public static void main(String... args) {
    // create object of Immutable
    Immutable obj = new Immutable("Iulie", 2022);
    // e ca la encapsulation, apelezi getterul
    System.out.println("nume:" + " " + obj.getNume()); // nume: Iulie
    System.out.println("data:" + " " + obj.getData()); // data: 2022
  }
}
