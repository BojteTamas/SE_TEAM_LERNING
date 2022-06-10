package CarmenH.june02;

public class ReferenceTypes {

  public void fly(String s) {
    System.out.print("string ");
  }

  public void fly(Object o) {
    System.out.print("object ");
  }

  public static void main(String[] args) {
    ReferenceTypes r = new ReferenceTypes();
    r.fly("test"); // here should access the one with string
    r.fly(56);
  } // here should access the one with object
}
