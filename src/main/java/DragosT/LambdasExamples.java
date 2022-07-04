package DragosT;

import java.util.ArrayList;
import java.util.List;

public class LambdasExamples {
  public static class Animal {
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

  public interface CheckTrait {
    boolean test(Animal a);
  }

  public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
      return a.canHop();
    }
  }

  public static class TraditionalSearch {
    public static void main(String[] args) {
      List<Animal> animals = new ArrayList<Animal>();
      animals.add(new Animal("fish", false, true));
      animals.add(new Animal("tiger", true, true));
      animals.add(new Animal("rabbit", true, false));
      // print(animals, new CheckIfHopper());// will be replaced below
      print(
          animals,
          a -> a.canHop()); // this is a labmbda that replaces the call too the CheckifHopper class
      print(animals, a -> a.canSwim());
      print(animals, a -> !a.canSwim());
    }
  }

  private static void print(List<Animal> animals, CheckTrait checker) {
    for (Animal animal : animals) {
      if (checker.test(animal)) System.out.print(animal + " ");
    }
    System.out.println();
  }
}
