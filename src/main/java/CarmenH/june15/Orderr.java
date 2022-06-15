package CarmenH.june15;

public class Orderr {
  String value = "t"; // one

  {
    value += "a";
  }

  {
    value += "c";
  }

  public Orderr() {
    value += "b";
  }

  public Orderr(String s) {
    value += s;
  }

  public static void main(String[] args) {
    Orderr orderica =
        new Orderr("f"); // this is what I have mistaken - this is not run - need to find out why
    orderica = new Orderr();
    System.out.println(orderica.value);
  }
}
/**
 * I chose tacbf - wrong
 *
 * <p>we create object orderica - so we have tacf - not b - because is the constructor with string
 * next we create a new object on the same reference orderica but with the constructor without
 * string so we have tacb
 */
