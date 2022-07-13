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
    Rope1 rope = new Rope1();
    rope.swing();
    new Rope1().swing();
    System.out.println(rope.LENGTH); // swing swing 10
  }
}
