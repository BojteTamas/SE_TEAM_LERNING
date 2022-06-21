package RalucaG.ClassDesignOCAChapter5;

abstract class GeometricalShapes {
  String color;

  double area;

  abstract void drawing();

  abstract double area();

  public abstract String toString();

  public GeometricalShapes(String color) {
    System.out.println("Shape of constructor is called");
    this.color = color;
  }

  public String getColor() {
    return color;
  }
}
