package CalinA.OCA8.JulOCA.toString;

public class Jul13toString1 {
  String name;
  int age;
  String Country;
  String collor;
  String Species;

  Jul13toString1(String name, int age, String Country, String collor, String Species) {
    this.name = name;
    this.age = age;
    this.Country = Country;
    this.collor = collor;
    this.Species = Species;
  }

  public String toString() {
    return name + " " + age + " " + Country + " " + collor + " " + Species;
  }

  public static void main(String[] args) {
    Jul13toString1 Z = new Jul13toString1("Zebra", 1, "Africa", "balck and white", "wild");

    System.out.println(Z.toString());
  }
}
