package CarmenH.secondTime;
// class declaration
public class Doog {
  // Instance Variables
  String doog_name;
  String doog_breed;
  int doog_age;
  String doog_color;

  // Constructor Declaration of Class
  public Doog(String name, String breed, int age, String color) {
    this.doog_name = name;
    this.doog_breed = breed;
    this.doog_age = age;
    this.doog_color = color;
  }

  // method 1
  public String getName() {
    return doog_name;
  }

  // method 2
  public String getBreed() {
    return doog_breed;
  }

  // method 3
  public int getAge() {
    return doog_age;
  }

  // method 4
  public String getColor() {
    return doog_color;
  }

  @Override
  public String toString() {
    return ("Hi! My name is "
        + this.getName()
        + ".\nMy breed, age and color are "
        + this.getBreed()
        + ", "
        + this.getAge()
        + ", "
        + this.getColor());
  }

  public static void main(String[] args) {
    Doog my_dog = new Doog("Mika", "stray", 8, "brown, white and black");
    System.out.println(my_dog.toString());
  }
}
