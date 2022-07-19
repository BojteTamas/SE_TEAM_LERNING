package CarmenH.June.june06;

public class InitializationOrder {

  private String name = "Torchie"; // rule 3 - instance variable

  {
    System.out.println(name);
  } // rule 3 - instance variable

  private static int COUNT = 0; // rule 2 - static

  static {
    System.out.println(COUNT);
  } // rule 2 - static

  {
    COUNT++;
    System.out.println(COUNT);
  } // rule 2 - static

  public InitializationOrder() {
    System.out.println("constructor");
  }

  public static void main(String[] args) {
    System.out.println("read to construct");
    new InitializationOrder();
  }
}
// rule 1 : we do not have a super class
// static first : 0  + Now that the statics are out of the way, the main() method can run.
// instance variable : Torchie
// rule 4 - constructor : constructor
// { COUNT++; System.out.println(COUNT); } this is after all the rules

/* my output - not correct:
0
1 ( this is not static) - instead it is one from void main "read to construct"
Torchie - ok
constructor - this is the constructor
 */

/* output:
0
read to construct
Torchie
1 --- why is this 1 here? what rule?
constructor
 */
