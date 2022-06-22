package RalucaG.ClassDesignOCAChapter5;

public class FlyTest implements CanFly {
  public void display() {
    System.out.println("Paper planes can fly!");
  }

  public static void main(String[] args) {
    FlyTest flyTest = new FlyTest();
    flyTest.display();
    System.out.println(speed);
  }
}
