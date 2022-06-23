package MariaD.june_23;

public class Clasa {
  static class Employee {
    String name;
    int varsta;

    Employee() {
      varsta = 20;
      System.out.println("Constructor");
    }
  }

  public static void main(String args[]) {
    Employee student = new Employee();
    /// Employee student = new Employee(30, "Maria Dunca"); nu ruleaza
    System.out.println(student.varsta); // /Constructor  20
  }
}
