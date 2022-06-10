package CarmenH.june02;

public class Plane {

  // public void fly(int i) {
  //    System.out.print("int "); //commenting this method it takes the other one
  //     }

  public void fly(long l) {
    System.out.print("long ");
  }

  public static void main(String[] args) {
    Plane p = new Plane();
    p.fly(123); // calls the one with match value, int
    p.fly(123L); // calls the one with long
  }
}
