package CarmenH.ExceptionsCh6;

public class Bunny {
  /**
   * public static void main(String[] args) throws NoMoreCarrotsException{ eatCarrot();// DOES NOT
   * COMPILE }
   *
   * <p>private static void eatCarrot() throws NoMoreCarrotsException { throw new
   * RuntimeException(); // added here an exception to throw }
   *
   * <p>//OR public static void main(String[] args) { try { eatCarrot(); } catch
   * (NoMoreCarrotsException e ) { // handle exception System.out.print("sad rabbit"); } catch
   * (RuntimeException e) { System.out.print("sadu rabbitu"); }
   *
   * <p>}
   */

  /**
   * //bad variant public void bad() { try { eatCarrot(); // this method doesn't throw that
   * exception anymore so there is an error } catch (NoMoreCarrotsException e ) {// DOES NOT COMPILE
   * System.out.print("sad rabbit"); } }
   *
   * <p>public void good() throws NoMoreCarrotsException { eatCarrot(); } private static void
   * eatCarrot() { }
   *
   * <p>public static void main(String[] args) {}
   */
}
