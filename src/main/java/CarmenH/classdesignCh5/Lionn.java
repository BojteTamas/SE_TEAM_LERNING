package CarmenH.classdesignCh5;

public class Lionn extends BigCat {

  public String getName() {
    return "Lion";
  }

  public void roar() {
    System.out.println("The Lion lets out a loud ROAR!");
  }
}
/**
 * BigCat extends Animal but is marked as abstract it is not required to provide an implementation
 * for the getName() method
 *
 * <p>The class Lion is not marked as abstract, and as the first concrete subclass, it must
 * implement all inherited abstract methods not defined in a parent class.
 *
 * <p>There is one exception to the rule for abstract methods and concrete classes: a concrete
 * subclass is not required to provide an implementation for an abstract method if an intermediate
 * abstract class provides the implementation
 *
 * <p>the subclasses do not consider it an inherited abstract method because it is no longer
 * abstract by the time it reaches the subclasses.
 */
