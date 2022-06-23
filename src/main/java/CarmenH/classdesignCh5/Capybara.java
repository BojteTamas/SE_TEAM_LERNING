package CarmenH.classdesignCh5;

public class Capybara extends Rodent {
  public static void main(String[] args) {
    Rodent rodent = new Rodent();

    if (rodent
        instanceof
        Capybara) { // REPLACING WITH THIS...WILL CAST ONLY IF RODENT IS instance of CApybara
      Capybara capybara = (Capybara) rodent;
    }

    // Capybara capybara = (Capybara)rodent; // Throws ClassCastException at runtime
  }
  /**
   * Thrown to indicate that the code has attempted to cast an object to a subclass of which it is
   * not an instance
   *
   * <p>This code creates an instance of Rodent and then tries to cast it to a subclass of Rodent,
   * Capybara. Although this code will compile without issue, it will throw a ClassCastException at
   * runtime since the object being referenced is not an instance of the Capybara class. The thing
   * to keep in mind in this example is the object that was created is not related to the Capybara
   * class in any way.
   */
}
