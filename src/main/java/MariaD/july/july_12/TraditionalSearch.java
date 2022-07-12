package MariaD.july.july_12;

import java.util.*;

class Animal {
  private String species;
  private boolean canHop;
  private boolean canSwim;

  public Animal(String speciesName, boolean hopper, boolean swimmer) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
  }

  public boolean canHop() {
    return canHop;
  }

  public boolean canSwim() {
    return canSwim;
  }

  public String toString() {
    return species;
  }
}

interface CheckTrait {
  boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
  public boolean test(Animal a) {
    return a.canHop();
  }
}

class CheckIfSwimmer implements CheckTrait {
  public boolean test(Animal a) {
    return a.canSwim();
  }
}

public class TraditionalSearch {
  public static void main(String[] args) {
    // Animal animals = new Animal("ship", true, false);
    List<Animal> animals = new ArrayList<Animal>(); // list of animals
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));

    // print(animals, new CheckIfHopper());//kangaroo rabbit,
    // print (animals, new CheckIfSwimmer());//fish turtle
    // folosind lambda se elimina clasele CheckIfHopper(), CheckIfSwimmer()
    print(animals, a -> a.canHop()); // kangaroo rabbit
    print(animals, a -> a.canSwim()); // fish turtle
  }

  private static void print(List<Animal> animals, CheckTrait checker) {
    for (Animal animal : animals) {

      if (checker.test(animal)) System.out.print(animal + " ");
    }
    System.out.println();
  }
}
