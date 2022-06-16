package CarmenH.classdesignCh5;

public class Animal {

  private static int age;

  private String name; // added at example 3

  public Animal(int age, String name) { // added at example 3
    super();
    this.age = age;
    this.name = name;
  }

  public static int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Animal(int age) { // added at example2
    super();
    this.age = age;
    this.name = null; // added at example 3
  }
}
