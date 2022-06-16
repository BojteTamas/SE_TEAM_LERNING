package CarmenH.classdesignCh5;

public class Lion extends Animal {

  public Lion(int age) { // this was added after adding super in Animal class
    super(age);
  }

  private static void roar() {
    System.out.println("The " + getAge() + " year old lion says: Roar!");
    // System.out.println("The "+age+" year old lion says: Roar!"); // this doesn't compile, the
    // primitive age is private, cannot be accessed by Lion
    // instead, we can use the getter as the line above

  }

  public static void main(String[] args) { // added main to run the example
    Lion leutul = new Lion(5); // instantiated the object
    leutul.setAge(5); // used the method from Animal which Lion extends
    roar(); // called roar method to see results
  }
}
