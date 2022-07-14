package RalucaG.RecapOCAChapters;

public class BusinessAnalyst {
  private String name;
  private int age;
  private int salary;
  private int hoursWorked;
  private int experience;

  public BusinessAnalyst(String name, int age) {
    this.name = name;
    this.age = 24;
    this.salary = 8500;
    this.hoursWorked = 8;
    this.experience = 10;
  }

  public void printBusinessAnalyst() {
    System.out.println(this.name + " is " + this.age + " years old");
  }

  public boolean isJunior() {
    if (this.experience < 2) {
      return true;
    }
    return false;
  }
  /**
   * public double salaryPerDay(){ double salaryPerday = this.salary/24; return this.salaryPerDay();
   * }
   */
  @Override
  public String toString() {
    return this.name + " is " + this.age + " years old, their salary per month is " + this.salary;
  }

  public void setHoursWorked(int hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  public int getHoursWorked() {
    return this.hoursWorked;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  private int getSalary() {
    return this.salary;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    BusinessAnalyst ralu = new BusinessAnalyst("Ralu", 31);
    BusinessAnalyst marina = new BusinessAnalyst("Marina", 34);
    System.out.println(ralu);
    System.out.println(marina);
  }
}
