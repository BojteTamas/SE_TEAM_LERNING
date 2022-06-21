package CalinA.OCA8.OCA06;

public class Jun21 {
  public static void main(String[] args) {
    int[] number = {100, 200, 300, 400, 500, 600};
    int highest_number = maximum(number);
    System.out.println("The highest number is " + highest_number);
  }

  public static int maximum(int[] numbers) {
    int bigestsofar = numbers[0];
    for (int num : numbers)
      if (num > bigestsofar) {
        bigestsofar = num;
      }
    return bigestsofar;
  }
}

// Read from OCA
//        The for-each Statement
