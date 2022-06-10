package CarmenH.may.may31;
// import static java.util.Arrays; // tries to use a static import to import a class. Remember that
// static imports are only for importing static members.Regular imports are for importing a class
import java.util.Arrays;
// static import java.util.Arrays.*; //tries to see if you are paying attention to the order of
// keywords. The syntax is import static and not vice versa.

public class BadStaticImports {

  public static void main(String[] args) {
    Arrays.asList("one"); // DOES NOT COMPILE //import java.util.Arrays;
    // above Line  is sneaky. We imported the asList method on line 4.
    // However, we did not import the Arrays class anywhere. This makes it okay to write
    // asList("one"); but not Arrays.asList("one");
  }
}
