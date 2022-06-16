package RalucaG.ClassDesignOCAChapter5;

public class Student extends Object {
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
