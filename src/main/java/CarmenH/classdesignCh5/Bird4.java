package CarmenH.classdesignCh5;

public abstract class Bird4 {
  private void fly() {
    System.out.println("Bird is flying");
  }

  public static void main(String[] args) {
    Bird4 bird = new Pelican();
    bird.fly();
  }
}
