package MariaD.july.july_13;

class Rope1 {
  // public static void main(String[] args) {
  public static int LENGTH = 5; // illegal start of expression

  static {
    LENGTH = 10;
  }

  public static void swing() {
    System.out.println("swing");
  }
}
// }
public class Rope {
  public static void main(String[] args) {
    Rope1 rope1 = new Rope1();
    rope1.swing();
    new Rope1().swing();
    System.out.println(rope1.LENGTH); // swing swing 10
  }
}
