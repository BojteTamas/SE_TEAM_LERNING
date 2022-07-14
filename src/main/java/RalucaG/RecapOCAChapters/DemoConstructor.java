package RalucaG.RecapOCAChapters;

public class DemoConstructor {
  int constructor1;
  int constructor2;

  DemoConstructor() {
    constructor1 = 1;
    constructor2 = 2;
    System.out.println("This is parent demo constructor");
  }

  DemoConstructor(int a) {
    constructor1 = a;
    System.out.println("This is second parent demo constructor");
  }

  public static void main(String[] args) {
    DemoConstructorChild constructorChild = new DemoConstructorChild();
    constructorChild.display();
  }
}
