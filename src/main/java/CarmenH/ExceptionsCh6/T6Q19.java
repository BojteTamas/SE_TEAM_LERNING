package CarmenH.ExceptionsCh6;

public class T6Q19 {

  public static void main(String[] args) {
    try {
      System.out.println("work real hard");
    } catch (StackOverflowError e) {

    } catch (RuntimeException e) {
    }
  }
}
// if we add Exception we have this error:
// java: exception java.lang.RuntimeException has already been caught

// IOException
//
// java: cannot find symbol
 //       symbol:   class IOException
 // location: class CarmenH.ExceptionsCh6.T6Q19

// IllegalArgumentException
// this is correct

// RuntimeException
// java: exception java.lang.RuntimeException has already been caught

// StackOverflowError
// this is correct also

// the 2 versions that are correct are less than RuntimeException
