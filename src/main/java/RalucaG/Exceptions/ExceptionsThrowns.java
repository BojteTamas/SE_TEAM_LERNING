package RalucaG.Exceptions;

public class ExceptionsThrowns {
  /**
   * public void visitPorcupine(){ try{ seeAnimal(); }catch(AnimalsOutForAWalk e){
   * System.out.println("try back later"); }catch (ExhibitClosed e){ System.out.println("not
   * today"); } }
   */
  public static void main(String[] args) {
    /**
     * String s = null; System.out.println(s.length()); //NullPointerException try{ reader=read();
     * }catch (IOException e){ try{ if(reader != null) reader.close(); }catch (IOException inner){}
     * } private static FileReader read() throws IOException{ // }
     */
    // String s = "abc";
    // int i = Integer.parseInt(s); //NumberFormatException

    // int a[]= new int[5];
    // a[10]=50;//ArrayIndexOutOfBoundsException

    // Multiple catch block exception
    // A try block can be followed by one or more catch blocks. Each catch block must contain a
    // different exception handler.
    try {
      int a[] = new int[5];
      a[5] = 20 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic exception occurs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBondsException occurs");
    } catch (Exception e) {
      System.out.println("Exception occurs");
    }
    System.out.println("Remaining code");

    try {
      int b[] = new int[5];
      System.out.println(b[10]);
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException occurs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutFBondsException occurs");
    } catch (Exception e) {
      System.out.println("Exception occurs");
    }
    System.out.println("Remaining code 2");
  }
}
