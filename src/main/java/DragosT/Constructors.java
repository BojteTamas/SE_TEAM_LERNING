package DragosT;

public class Constructors {
  private String color;
  private int height;
  private int width;

  public Constructors(int height, int theWidth) {
    this.height = height; // if the name of the variable is a duplicate we must use this
    width = theWidth; // not duplicate name so it's ok
    color = "Red"; // no need to use this since there is no duplicate variable eq in the constructor
  }

  public static void main(String[] args) {
    Constructors c = new Constructors(1, 2);
    System.out.println(c.color + " " + c.width + " " + c.height);
  }
}
