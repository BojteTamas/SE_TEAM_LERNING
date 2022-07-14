package MariaD.july.july_13;

import java.util.*;

public class Teeest {
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
    System.out.print("object");
  }

  public static void main(String[] args) {
    Teeest t = new Teeest();
    short s = 123;
    t.print(s);
    t.print(true);
    t.print(6.789); // intobjectobject
  }
}
