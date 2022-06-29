package MariaD.june_29;

import java.util.*;

public class Pass_by_refernce {
  public static void swapByReference(int a, int b) {
    int temp = a;
    temp = b;
    a = b;
  }

  public static void main(String[] args) {
    int original1 = 1;
    int original2 = 2;
    swapByReference(original1, original2);
    System.out.println(original1); // 1
    System.out.println(original2); // 1
  }
}
