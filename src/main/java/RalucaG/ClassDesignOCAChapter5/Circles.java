package RalucaG.ClassDesignOCAChapter5;

public class Circles extends GeometricalShapes {
  double radius;

  public Circles(String color, double radius) {
    super(color);
    System.out.println("Circle constructor called");
    this.radius = radius;
  }

  @Override
  void drawing() {
    System.out.println("Drawing a circle...");
  }

  @Override
  double area() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public String toString() {
    return "Circles color is " + super.getColor();
  }
}
