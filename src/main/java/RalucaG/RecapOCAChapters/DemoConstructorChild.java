package RalucaG.RecapOCAChapters;

public class DemoConstructorChild extends DemoConstructor {
  int constructochild1;
  int constuctochild2;

  DemoConstructorChild() {
    constructochild1 = 3;
    constuctochild2 = 4;
    System.out.println("This is the child constructor of demo constructor");
  }

  public void display() {
    System.out.println("Constructor1 is " + constructor1);
    System.out.println("Constructor2 is " + constructor2);
    System.out.println("Constructochild1 is " + constructochild1);
    System.out.println("Constructochild2 is " + constuctochild2);
  }
}
