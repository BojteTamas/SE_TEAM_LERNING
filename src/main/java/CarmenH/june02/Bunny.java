package CarmenH.june02;

public class Bunny {
  // a constructor is a special method that matches the name of the class and has no return type
  public Bunny() {
    System.out.println("constructor");
  }

  // public bunny() { } // DOES NOT COMPILE - doesn't match the classname because Java is case
  // sensitive.
  // public void Bunny() { } // is a perfectly good method, but is not a constructor because it has
  // a return type.

  private String color;
  private int height;
  private int length;

  public Bunny(int length, int theHeight) {
    length =
        this.length; // The instance variable length starts out with a 0 value. That 0 is assigned
    // to the method parameter length. The instance variable stays at 0.
    height =
        theHeight; // The parameter theHeight and instance variable height have different names.
    // Since there is no naming collision, this is not required
    this.color =
        "white"; // it is allowed to use this even when there is no dupli- cation of variable names.
  }

  public static void main(String[] args) {
    Bunny b = new Bunny(1, 2);
    System.out.println(b.length + " " + b.height + " " + b.color);
  }
}
