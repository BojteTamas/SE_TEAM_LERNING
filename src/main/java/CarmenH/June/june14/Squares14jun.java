package CarmenH.June.june14;

public class Squares14jun {

  public static long square(int x) {
    long y = x * (long) x; // y = 9 * 9 = 81
    x = -1; // x gets -1
    return y;
  }

  public static void main(String[] args) {
    int value = 9; // never gets reassigned it stays 9
    long result = square(value); // this does set result to 81
    System.out.println(value); // value is still at 9 and this is printed
    System.out.println(result);
  }
}
