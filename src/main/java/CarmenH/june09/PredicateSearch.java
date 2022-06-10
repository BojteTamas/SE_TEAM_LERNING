package CarmenH.june09;

import java.util.*;
import java.util.function.*;

public class PredicateSearch {

  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Animal("shark", false, true));
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));
    print(animals, a -> !a.canHop());

    // this is the example that can be used with predicate:
    List<String> bunnies = new ArrayList<>();
    bunnies.add("long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    System.out.println(bunnies); // [long ear, floppy, hoppy]
    bunnies.removeIf(s -> s.charAt(0) != 'h'); // here it is used the predicate
    System.out.println(bunnies); // [hoppy]
  }

  private static void print(
      List<Animal> animals,
      Predicate<Animal> checker) { // here we use Predicate instead of a new interface CheckTrait
    for (Animal animal : animals) {
      if (checker.test(animal)) System.out.print(animal + " ");
    }
    System.out.println();
  }
}
/**
 * private static void print(List<Animal> animals, CheckTrait checker) { // version with method to
 * check the trait for (Animal animal : animals) { if (checker.test(animal)) System.out.print(animal
 * + " "); } System.out.println(); }
 *
 * <p>public interface Predicate<T> { // the Predicate - general form - we use it with Animal
 * boolean test(T t); }
 */
