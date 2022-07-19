package CarmenH.June.june14;

public class StringBuildersCH {

  public static StringBuilder work(StringBuilder a, StringBuilder b) {
    a = new StringBuilder("a"); // a - this does not affect the caller
    b.append("b"); // s2b -- this affects the caller
    return a; // a  //pass the reference to tha caller
  }

  public static void main(String[] args) {
    StringBuilder s1 = new StringBuilder("s1"); // s1
    StringBuilder s2 = new StringBuilder("s2"); // s2
    StringBuilder s3 = work(s1, s2); // a ="a" , s2=s2b
    System.out.println("s1 = " + s1); // s1
    System.out.println("s2 = " + s2); // s2b
    System.out.println("s3 = " + s3); // a
  }
}
