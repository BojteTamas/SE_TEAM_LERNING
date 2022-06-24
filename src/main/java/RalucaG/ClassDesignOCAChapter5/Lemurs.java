package RalucaG.ClassDesignOCAChapter5;

public class Lemurs extends Primates implements HasTaill {
  @Override
  public boolean isTailStriped() {
    return false;
  }

  public int age = 10;

  public static void main(String[] args) {
    Lemurs lemurs = new Lemurs();
    System.out.println(lemurs.age);

    HasTaill hasTaill = lemurs;
    System.out.println(hasTaill.isTailStriped());

    Primates primates = lemurs;
    System.out.println(primates.hasHair());

    Primates primates1 = lemurs;
    // Lemurs lemurs1 = primates; //does not compile - we tried to convert the primate reference
    // back to a lemur reference without an explicit cast; it should be lemurs type;
    Lemurs lemurs1 =
        (Lemurs)
            primates; // cast the object to a subclass of the object Primates => access to all the
    // methods available to the Lemurs class
    System.out.println(lemurs1.age);
  }
}
