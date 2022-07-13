package CarmenH.ExceptionsCh6;

public class Ex_ExceptionInInitializerError {

  static {
    int[] countsOfMoose = new int[3];
    int num = countsOfMoose[-1];
  }

  public static void main(String[] args) {}
}
// Exception in thread "main" java.lang.ExceptionInInitializerError
// java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3

// We get the ExceptionInInitializerError because the error happened in a static initializer.
// That information alone wouldn’t be particularly useful in fixing the problem.
// Therefore, Java also tells us the original cause of the problem: the
// ArrayIndexOutOfBoundsException that we need to fix.

// The ExceptionInInitializerError is an error because Java failed to load the whole class.
// This failure prevents Java from continuing.
