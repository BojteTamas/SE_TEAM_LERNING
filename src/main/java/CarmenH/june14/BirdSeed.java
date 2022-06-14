package CarmenH.june14;

public class BirdSeed {

  private int numberBags;
  boolean call;

  public BirdSeed() {
    // new BirdSeed(2); //line 1 - not correct
    this(2); // this(5); -> this.numberBags = 5; -----this is the object initialized in main and
    // because it has an int as parameter, takes the constructor with parameter???
    call = false;
    // new  BirdSeed(2);//line 2; - not correct -  creates new object rathewr than setting the
    // fields from the existing one
    // this(2);
  }

  public BirdSeed(int numberBags) {
    this.numberBags = numberBags;
  }
  // not really sure how works this ....
  public static void main(String[] args) {
    BirdSeed seed = new BirdSeed();
    System.out.println(seed.numberBags);
  }
}
/**
 * constructors cannot be called without new!!!! So using this(2); will initialize the numberBags
 * property of the "this" object (referred by reference variable seed) to 2 and thus 2 will be
 * printed. So you would think E and F to be the correct answers, but there's a catch! The call to
 * another constructor using this() must be the very first statement of the constructor!
 *
 * <p>found some more explanation
 * https://coderanch.com/t/649494/certification/Review-Questions-chapter-page-Java
 */
