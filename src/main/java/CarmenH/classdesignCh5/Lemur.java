package CarmenH.classdesignCh5;

public class Lemur extends Primate2 implements HasTail2 {

  public boolean isTailStriped() {
    return false;
  }

  public int age = 10;

  public static void main(String[] args) {
    Lemur lemur = new Lemur();
    System.out.println(lemur.age);
    HasTail2 hasTail = lemur;
    System.out.println(hasTail.isTailStriped());
    Primate2 primate = lemur;
    System.out.println(primate.hasHair());
  }
}
