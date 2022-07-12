package MariaD.july.july_11;

import java.util.*;

/*
immutable is only measured after the object is constructed.
Immutable classes are allowed to have values. They just can't change after instantiation.
 */
class ImmutableSwan {
  // declaring private int
  private int numberEggs;

  public ImmutableSwan(int numberEggs) {
    // class members are initialized using constructor
    this.numberEggs = numberEggs;
  }
  // getter method returns the copy of class members
  public int getNumberEggs() {
    return numberEggs;
  }
}

public class Immutable_2 {
  public static void main(String... args) {
    ImmutableSwan swan = new ImmutableSwan(13);
    // apelezi getter-ul
    System.out.println("acesta este nr de oua:" + swan.getNumberEggs()); // acesta este nr de oua:13
  }
}
