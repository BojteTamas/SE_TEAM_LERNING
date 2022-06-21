package RalucaG.ClassDesignOCAChapter5;

public class Rectangle extends GeometricalShapes {

  // public Rectangle(String color) {
  //     super(color);
  // }
  double length;
  double width;

  @Override
  void drawing() {
    System.out.println("Drawing a rectangle..");
  }

  public Rectangle(String color, double length, double width) {
    super(color);
    System.out.println("Rectangle constructor called");
    this.length = length;
    this.width = width;
  }

  @Override
  double area() {
    return length * width;
  }

  @Override
  public String toString() {
    return "Rectangle color is " + super.getColor() + " and area is : " + area();
  }
}
