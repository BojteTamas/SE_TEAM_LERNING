package RalucaG.ClassDesignOCAChapter5;

public class Student extends Object {
  /**
   * extends Object is implicit as public class Student java.lang.Object is the only class that
   * doesn't have parent classes when Java sees you define a class that doesn’t extend another
   * class, it immediately adds the syntax extends java.lang.Object to the class defi nition if you
   * look at the inheritance structure of any class, it will always end with java.lang.Object on the
   * top of the tree,
   */
  private String name;

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static void main(String[] args) {
    Student student = new Student("Ionel Ionica");
    System.out.println(student.getName());
  }
}
