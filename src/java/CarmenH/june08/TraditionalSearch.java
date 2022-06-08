package CarmenH.june08;
import java.util.List;
import java.util.ArrayList;


public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        //print(animals, new CheckIfHopper()); // pass class that does check
        // this can be replaced with print(animals, a -> a.canHop()); ( lambda expression)

        print(animals, a -> a.canHop()); // this works
        print(animals, a -> a.canSwim()); //this gets an error - added by mistake an } in Animal class - that's why got error
        //checked if swimmer without writing a new class like CheckIfSwimmer() - with lambda instead

        //it works also with negations!!
        print(animals, a -> ! a.canSwim()); // kind of logic, being a boolean
/**
 * Deferred execution means that code is specified now but will run later. In this case, later is when the print() method calls it.
 */
    }

        private static void print(List<Animal> animals, CheckTrait checker) {
            for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
            }
            System.out.println();
        }
}
