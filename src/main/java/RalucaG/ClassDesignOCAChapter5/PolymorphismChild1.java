package RalucaG.ClassDesignOCAChapter5;

public class PolymorphismChild1 extends PolymorphismParent implements PolymorphismInterface {
  @Override
  void print() {
    System.out.println("Polymorphism child subclass 1");
  }

  @Override
  public boolean isPolymorphClass() {
    return false;
  }

  public int poli = 2;

  public static void main(String[] args) {
    PolymorphismChild1 obj1 = new PolymorphismChild1();
    System.out.println(obj1.poli);

    PolymorphismInterface obj2 = obj1;
    System.out.println(obj2.isPolymorphClass());

    PolymorphismParent obj3 = obj1;
    System.out.println(obj3.hasPolimorph());
  }
}
