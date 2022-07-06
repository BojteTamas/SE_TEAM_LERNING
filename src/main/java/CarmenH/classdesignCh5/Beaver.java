package CarmenH.classdesignCh5;

public class Beaver extends Rodent3 {
  public static Integer chew()
      throws RuntimeException { // added static // Integer insteadd of Numeric
    System.out.println("Beaver is chewing on wood");
    return 2;
  }

  public static void main(String[] args) {
    // new Beaver();
    // chew();
    //  Beaver.chew();
    //  int rezultat=Beaver.chew();
    int rezultat2 = chew();
    System.out.println(rezultat2);
  }
}
/**
 * It fails to compile because the return types are not covariant. java.lang.Number is not
 * compatible with java.lang.Integer It fails to compile because of a static modifier mismatch
 * between the two methods.
 */
