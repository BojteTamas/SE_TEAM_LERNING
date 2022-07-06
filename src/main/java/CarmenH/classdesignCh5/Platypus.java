package CarmenH.classdesignCh5;

public class Platypus extends Mammal {

  public Platypus() {
    super(0); // output: MammalPlatypus
    System.out.print("Platypus");
  }

  public static void main(String[] args) {
    // new Mammal(5); //with this is error - just add in parent class a no-argument constructor or
    // use the explicit call in child class
    new Platypus(); // output: MammalPlatypus
  }
}
/** the first line of a Platypus constructor should be an explicit call to super(int age) */
