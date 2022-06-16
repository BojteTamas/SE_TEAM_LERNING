package CarmenH.classdesignCh5;

public class Chimpanzee extends Ape {

  public static void main(String[] args) {
    new Chimpanzee();
  }
}
/**
 * order of execution: The compiler first inserts the super() command as the first statement of both
 * the Primate and Ape constructors.
 *
 * <p>next, the compiler inserts a default no-argument constructor in the Chimpanzee class with
 * super() as the first statement of the constructor
 *
 * <p>The code will execute with the parent constructors called first
 *
 * <p>yields the following output: Primate Ape
 */
