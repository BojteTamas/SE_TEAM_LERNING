package RalucaG.RecapOCAChapters;

public class InstanceTesting {
  public static void main(String[] args) {
    AnotherInstanceDemo anotherInstanceDemo = new AnotherInstanceDemo();
    anotherInstanceDemo.something(); // we call the instance method here via object of class
    System.out.println(
        "x value is equal to: " + AnotherInstanceDemo.x); // we access static var via class
  }
}
