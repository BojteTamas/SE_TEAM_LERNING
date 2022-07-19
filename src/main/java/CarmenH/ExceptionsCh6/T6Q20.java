package CarmenH.ExceptionsCh6;

public class T6Q20 {
  public static void main(String[] args) {
    System.out.print("a"); // this is printed first
    try {
      System.out.print("b"); // this is printed second
      throw new IllegalArgumentException(); // exception caught and go to block
    } catch (IllegalArgumentException e) {
      System.out.print("c"); // printed third
      throw new RuntimeException("1");
      /**
       * try { throw new RuntimeException("1"); }catch (RuntimeException p) {
       * System.out.print("d");} //now here is caught and printed too
       */
    } catch (RuntimeException e) {
      System.out.print("d"); // why not printed - this is not printed because this is not caught
      throw new RuntimeException("2");
    } finally {
      System.out.print("e"); // printed forth
      // throw new RuntimeException("3"); //exception set to "3"
    }
  }
}
