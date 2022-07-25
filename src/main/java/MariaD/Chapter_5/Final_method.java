package MariaD.Chapter_5;

import java.util.*;

class Bird {
  public final boolean hasWings() {
    return true;
  }
}

public class Final_method extends Bird {
  public static void main(String[] args) {
    Final_method bird = new Final_method();
    /*public final boolean hasWings() {
        return false;
    }
     */
  }
}
