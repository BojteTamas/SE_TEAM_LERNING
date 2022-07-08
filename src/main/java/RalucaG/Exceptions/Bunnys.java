package RalucaG.Exceptions;

public class Bunnys {
  public static void main(String[] args) {
    try {
      eatCarrot();
    } catch (NoMoreCarrotsException e) {
      System.out.println("sad bunny");
    }
  }

  private static void eatCarrot() throws NoMoreCarrotsException {}

  public void bad() {
    try {
      eatCarrot();
    } catch (NoMoreCarrotsException e) {
      System.out.println("sad bunny 2");
    }
  }

  public void good() throws NoMoreCarrotsException {
    eatCarrot();
  }
  // private static void eatCarrot(){}
}
/**
 * eatCarrot() can't throw checked exception ->which means it's unchecked = no compiler
 * warning/error
 */
