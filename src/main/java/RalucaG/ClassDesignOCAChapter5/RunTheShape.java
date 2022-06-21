package RalucaG.ClassDesignOCAChapter5;

public class RunTheShape {
  public static void main(String[] args) {
    GeometricalShapes shapes1 = new Circles("Purple", 2.2);
    GeometricalShapes shapes2 = new Rectangle("Blue", 2, 4);
    System.out.println(shapes1.toString());
    System.out.println(shapes2.toString());
    shapes1.drawing();
    shapes2.drawing();
  }
}
