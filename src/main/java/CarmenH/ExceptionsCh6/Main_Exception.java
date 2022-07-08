package CarmenH.ExceptionsCh6;

public class Main_Exception {
  static void explore() {
    try {
      fall(); // this is run - this throws exceptions - it gets out of try block and goes to catch
      System.out.println("never get here"); // because of exception - never gets here
    } catch (RuntimeException e) {

      getUp();
    }

    seeAnimals();
  }

  private static void seeAnimals() {
    System.out.println("acum priveste animalele");
  }

  private static void getUp() {
    System.out.println("s-a ridicat");
  }

  static void fall() {
    throw new RuntimeException();
  }

  public static void main(String[] args) {
    explore();
    /**
     * try { // code that generates exception int divideByZero = 5 / 0; } catch (ArithmeticException
     * e) { System.out.println("ArithmeticException => " + e.getMessage()); } finally {
     * System.out.println("This is the finally block"); }
     */
  }
}
