package CalinA.OCA8.JulOCA.Arrays.CreatingArray;

public class Jul19UsinganArray {
  public static void main(String[] args) {
    int arr[] = {5, 10, 15, 20, 25};
    sum(arr);
  }

  public static void sum(int[] arr) {
    int sum = 0;
    for (int x = 0; x < arr.length; x++) sum += arr[x];
    System.out.println("Sume is: " + sum);
  }
}
// Read from OCA
//        Using an Array
