package CarmenH.classdesignCh5;

public class Shark extends Fish {

  private static int numberOfFins = 8; // added main - need to add static here

  public Shark(int age) { // added main + alternative - need to add static here
    super(age);
    this.size = 4;
  }

  public void displaySharkDetails() { // removed static
    // System.out.print("Shark with age: "+getAge());
    //  System.out.print(" and "+size+" meters long");
    // System.out.print(" with "+numberOfFins+" fins");
    // an alternative:
    // System.out.print("Shark with age: "+this.getAge());
    //  System.out.print(" and "+this.size+" meters long");
    //  System.out.print(" with "+this.numberOfFins+" fins");
    // second alternative:
    System.out.print("Shark with age: " + super.getAge());
    System.out.print(" and " + super.size + " meters long");
    System.out.print(" with " + this.numberOfFins + " fins");
    //  System.out.print(" with "+super.numberOfFins+" fins"); // DOES NOT COMPILE

    // explanation: This code will not compile because numberOfFins is only a member of
    // the current class, not the parent class. In other words, we see that this and super
    // may both be used for methods or variables defined in the parent class, but only this
    // may be used for members defined in the current class.
  }

  public static void main(String[] args) {
    // displaySharkDetails(); // with no instantiation there are default values "Shark with age: 0
    // and 0 meters long with 8 fins"
    // Shark rechinasul = new Shark(12); //Shark with age: 12 and 4 meters long with 8 fins
    // rechinasul.displaySharkDetails();
  }
}
