package CarmenH.june14;

public class Test14jun {

  public void print(byte x) {
    System.out.print("byte");
  }

  public void print(int x) {
    System.out.print("int");
  }

  public void print(float x) {
    System.out.print("float");
  }

  public void print(Object x) {
    System.out.print("Object");
  }

  public static void main(String[] args) {
    Test14jun t = new Test14jun();
    short s = 123;
    t.print(s); // int
    t.print(true); // Object
    t.print(6.789); // float - this is a double not a float - needed to have f
  }
}
