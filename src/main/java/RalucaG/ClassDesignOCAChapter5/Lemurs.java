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
  }
}
