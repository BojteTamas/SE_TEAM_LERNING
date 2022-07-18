package CarmenH.ExceptionsCh6;

public class T6Q4 {
  public static void main(String[] args) {
    Object obj = new Integer(3); // DEPRECATED API USAGE
    // String str = (String) obj;
    // System.out.println(str);
  }
}
  //  Exception in thread "main" java.lang.ClassCastException

// java.lang.Integer cannot be cast to class java.lang.String
