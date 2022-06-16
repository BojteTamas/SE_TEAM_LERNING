package RalucaG.ClassDesignOCAChapter5;

public class ChildClass extends ParentClass {
  int number = 1;
  // display child class method
  @Override
  public void display() {
    System.out.println("this will display the child class");
  }

  public void anotherMethod() {
    // create a new instance for child class
    ChildClass childClass = new ChildClass();
    childClass.display(); // this will call the display method of the child class
    super.display(); // this will call the display method of the parent class
    System.out.println(
        "this will display value of number declared in child class " + childClass.number);
    System.out.println(
        "this will display value of number declared in parent class " + super.number);
  }
}
