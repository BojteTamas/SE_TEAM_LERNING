package MariaD.july.july_13;

import MariaD.july.july_13.Roope.*;
import java.util.*;

public class RopeSwing {
  public static Roope rope2 = new Roope();
  public static Roope rope3 = new Roope();

  {
    System.out.println(rope2.length);
  }

  public static void main(String[] args) {
    rope2.length = 2;
    rope3.length = 8;
    System.out.println(rope2.length); // 8
  }
}
