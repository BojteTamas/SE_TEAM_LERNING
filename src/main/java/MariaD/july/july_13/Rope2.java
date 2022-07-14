package MariaD.july.july_13;

public class Rope2 {
  public static void swing() {
    System.out.println("swing");
  }

  public void climb() {
    System.out.println("climb");
  }

  public static void play() {
    // climb();//we cannot declare an instance method into a static one
    swing(); // we can declare a static method into another static method
  }

  public static void main(String[] args) {
    Rope2 rope = new Rope2();
    rope.play();
    Rope2 rope2 = null;
    rope2.play();
    // java: non-static method climb() cannot be referenced from a static context
  }
}
