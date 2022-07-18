package CarmenH.ExceptionsCh6;

public class T6Q17 {
  public static void main(String... args) {}

  class HasSoreThroatException extends Exception {}

  class TiredException extends RuntimeException {}

  interface Roar {
    void roar() throws HasSoreThroatException;
  }

  class Lion implements Roar {

    // INSERT CODE HERE
    // public void roar(){}
    // public void roar() throws Exception{} // this is larger than the initial one from the
    // interface
    // java: roar() in CarmenH.ExceptionsCh6.T6Q17.Lion cannot implement roar() in
    // CarmenH.ExceptionsCh6.T6Q17.Roar
    //  overridden method does not throw java.lang.Exception

    // public void roar() throws HasSoreThroatException{}
    // public void roar() throws IllegalArgumentException{} // D // runtime exceptions
    public void roar() throws TiredException {} // E // runtime exceptions
  }
}
