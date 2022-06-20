package RalucaG.ClassDesignOCAChapter5;

public class PolarBears extends Bears {

  private static int getnumberOfBears() {
    return 67;
  }

  public static void eat() {
    System.out.println("Polar bear is eating fish");
  }

  @Override
  public void hibernate() {
    super.hibernate();
  }

  public static void drink() {
    System.out.println("Polar bears drink water");
  }

  public static void main(String[] args) {
    PolarBears.eat();
    PolarBears
        .getnumberOfBears(); // this method is ignored when private , no error compiling but no
    // display;
    PolarBears.drink();
    Bears.drink();
  }
}
