package CarmenH.classdesignCh5;

public class Frog implements CanHop {

  public static void main(String[] args) {
    Frog frog1 = new TurtleFrog();
    TurtleFrog frog2 = new TurtleFrog();
    CanHop frog3 = new TurtleFrog();
    Object frog4 = new TurtleFrog();
  }
}
