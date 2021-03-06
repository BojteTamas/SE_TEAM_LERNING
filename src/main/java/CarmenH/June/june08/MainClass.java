package CarmenH.June.june08;

import java.util.Date;

public class MainClass {
  public static void main(String[] args) {
    ImmutableClass im = ImmutableClass.createNewInstance(100, "test", new Date());
    System.out.println(im);
    tryModification(im.getImmutableField1(), im.getImmutableField2(), im.getMutableField());
    System.out.println(im);
  }

  private static void tryModification(
      Integer immutableField1, String immutableField2, Date mutableField) {
    immutableField1 = 10000;
    immutableField2 = "test changed";
    mutableField.setDate(10); // this is deprecated - should have change the time..I suppose
  }
}
