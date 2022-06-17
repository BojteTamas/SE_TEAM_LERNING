package CarmenH.classdesignCh5;

public class Fish {

  protected static int size; // added main - need to add static here
  private static int age; // added main - need to add static here

  public Fish(int age) {
    this.age = age;
  }

  public static int getAge() { // added main - need to add static here
    return age;
  }
}
