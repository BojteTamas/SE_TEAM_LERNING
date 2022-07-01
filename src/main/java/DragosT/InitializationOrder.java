package DragosT;
// 1.If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For
// now, just say “no superclass” and go on to the next rule.)
// 2.Static variable declarations and static initializers in the order they appear in the file.
// 3.Instance variable declarations and instance initializers in the order they appear in the file.
// 4.The constructor.
public class InitializationOrder {
  private String name = "Private str";

  {
    System.out.println(name);
    // this will run seccond because it's not static
  }

  private static int COUNT = 2;

  static {
    System.out.println(COUNT);
    // this will run first because it's static
  }

  static {
    COUNT += 4;
    System.out.println(COUNT);
    // this will run first because it's static
  }

  public InitializationOrder() {
    System.out.println("constructor");
    // this as the constructor will run last
  }

  public static void main(String[] args) {
    InitializationOrder init = new InitializationOrder();
    // all 4 rules are valid only because we have an object instantiated
    // if only call the class with new InitializationOrder();
    // only rule 1 and 2 will apply
  }
}
