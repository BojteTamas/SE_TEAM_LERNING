package CarmenH.ExceptionsCh6;

public class OurGirl {
  static void explore() {
    try {
      seeAnimals();
      fall();

    } catch (RuntimeException e) {
      getHugFromDaddy();
    } finally {
      getUp();
      seeMoreAnimals();
    }

    goHome();
  }

  private static void seeMoreAnimals() {
    System.out.println("uuuuuu more animals");
  }

  private static void goHome() {
    System.out.println("Done here, going home for a rest!");
  }

  private static void getHugFromDaddy() {
    System.out.println("got a hug from daddy");
  }

  private static void seeAnimals() {
    System.out.println("acum priveste animalele");
    throw new ExhibitClosedForLunch();
  }

  private static void getUp() {
    System.out.println("s-a ridicat");
  }

  static void fall() {
    System.out.println("auci, a cazut!");
    throw new RuntimeException();
  }

  public static void visitPorcupine() {
    try {
      seeAnimals();
      // what exception - how to throw here an exception to go to catch ( first or second)
    } catch (AnimalsOutForAWalk e) { //  I don't know how to reach here
      // first catch block
      System.out.print("try back later");
    } catch (ExhibitClosed e) { //  I don't know how to reach here
      // second catch block
      System.out.print("not today");
    }
  }

  /**
   * try { seeAnimal(); } catch (ExhibitClosedForLunch e) {// subclass exception
   * System.out.print("try back later"); } catch (ExhibitClosed e) {// superclass exception
   * System.out.print("not today"); } } always in this order, subclass and after that superclass .
   * If no inheritance, then the order doesn't matter
   */
  public static void main(String[] args) {
    // explore();

    visitPorcupine();
  }
}
