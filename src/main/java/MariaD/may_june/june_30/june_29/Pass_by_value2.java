package MariaD.may_june.june_30.june_29;

public class Pass_by_value2 {
  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }

  public static void main(String[] args) {
    int original1 = 1;
    int original2 = 2;
    int original3 = 3;
    swap(original1, original3);
    swap(original2, original3);
    System.out.println(original1); // 1
    System.out.println(original2); // 2
    System.out.println(original3); // 3
  }
}
