package MariaD.may_june;

public class MariaD9_MAY {
  // ternary expression
  public static void main(String[] args) {
    //   int y = 1;
    //  int z = 1;
    //    final int x = y < 10 ? y++ : z++;
    //    System.out.println(y + "," + z);
    // }
    //   {
    //     int[] values = new int[3]; values[0] = 10;
    //     values[1] = new Integer(5); values[2] = 15;
    //     for(int i=1; i<values.length; i++) {
    //         System.out.print(values[i]-values[i-1]);
    //         }
    //     }

    // the switch statement

    int dayOfWeek = 5;
    switch (dayOfWeek) {
      default:
        System.out.println("Weekday");
        break;
      case 0:
        System.out.println("Sunday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
    }
  }
}
