package CarmenH.classdesignCh5;

public class Zebra extends Animal {

  public Zebra(int age) {
    super(age);
    System.out.println(age);
  }

  public Zebra() {
    this(4);
  }

  public static void main(String[] args) {
    Zebra zebruta = new Zebra(10); // if we add the integer is used the first, otherwise the second
    // I don't know how to access the age being private

    System.out.println(zebruta.getAge()); // used this method from Animal class
  }
}
