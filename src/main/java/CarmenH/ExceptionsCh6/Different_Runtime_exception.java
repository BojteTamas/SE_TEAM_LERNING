package CarmenH.ExceptionsCh6;

public class Different_Runtime_exception {

  public static void main(String... args) {

    // ArithmeticException
    // int answer = 11 / 0; //Exception in thread "main" java.lang.ArithmeticException: / by zero

    // ArrayIndexOutOfBoundsException
    // int[] countsOfMoose = new int[3];
    // System.out.println(countsOfMoose[-1]);
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds
    // for length 3

    // ArrayIndexOutOfBoundsException
    // int total = 0;
    // int[] countsOfMoose = new int[3];
    // for (int i = 0; i < countsOfMoose.length; i++) // < not <=
    //      total += countsOfMoose[i];
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds
    // for length 3

    // ClassCastException
    // incompatible types: java.lang.String cannot be converted to java.lang.Integer
    // String type = "moose";
    // Integer number = (Integer) type;

    // String type = "moose";
    // Object obj = type;
    // Integer number = (Integer) obj;
    // java.lang.String cannot be cast to class java.lang.Integer

    // IllegalArgumentException

    // public void setNumberEggs(int numberEggs) {// setter
    // if (numberEggs >= 0) // guard condition
    // this.numberEggs = numberEggs; }

    // instead, we can add exception:
    // public static void setNumberEggs(int numberEggs) {
    // if (numberEggs < 0)
    // throw new IllegalArgumentException( "# eggs must not be negative"); // this is an example of
    // exception thrown by the programmer
    // this.numberEggs = numberEggs;
    // }

    // NullPointerException

    // String name = null; // why doesn't work without initializing it?
    // printLength(name);

    // public static void printLength(String name) throws NullPointerException
    // {
    // System.out.println(name.length());
    // }

    // NumberFormatException
    // Integer.parseInt("abc");
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
  }
}
