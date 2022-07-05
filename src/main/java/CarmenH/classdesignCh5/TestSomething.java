package CarmenH.classdesignCh5;

public class TestSomething {

  public static void main(String[] args) {

    String a = "";
    System.out.println("String a = \"\" este " + a);
    a += 2;
    System.out.println("a += 2 este " + a);
    a += 'c';
    System.out.println("a += 'c' este " + a);
    a += false;
    System.out.println("a += false este " + a);
    if (a == "2cfalse") System.out.println("=="); // String objects are not compared with ==
    if (a.equals("2cfalse")) System.out.println("equals");
  }
}
// result is "equals"
// everything is taken as string
