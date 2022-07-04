package MariaD.july.july_4;

import java.util.*;

public class Primitive_type {
  public void avion(int i) {
    System.out.println("int true");
  }

  public void avion(long l) {
    System.out.println("long");
  }

  public static void main(String[] args) {
    Primitive_type primitive = new Primitive_type();
    primitive.avion(1);
    primitive.avion(1l);
  }
}
//// same, autoboxing is happening
