package DragosT;

public class EncapsulatingData {
  private int numberCount;

  public int
      getNumberCount() { // this is the getter method starts with get if not boolean is if it is
    return numberCount;
  }

  public void setNumberCount(
      int numberCount) { // this is a setter( or mutator) method begings with set
    if (numberCount >= 0) // condition to protect the result
    this.numberCount = numberCount;
  }

  public static void main(String[] args) {
    EncapsulatingData obj1 = new EncapsulatingData();
    obj1.setNumberCount(3);
    obj1.setNumberCount(-1); // will not change value
    System.out.println(obj1.numberCount);
  }
}
