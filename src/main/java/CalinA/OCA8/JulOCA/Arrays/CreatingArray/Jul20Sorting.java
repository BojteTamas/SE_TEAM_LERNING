package CalinA.OCA8.JulOCA.Arrays.CreatingArray;

public class Jul20Sorting {
  public static void main(String[] args) {
    int arr[] = {30, 35, 25, 15};
    for (int x = 0; x < arr.length; x++) {
      for (int y = x + 1; y < arr.length; y++) {
        int temp = 0;
        if (arr[y] < arr[x]) {
          temp = arr[x];
          arr[x] = arr[y];
          arr[y] = temp;
        }
      }
      System.out.print(arr[x] + " ");
    }
  }
}
// Read from OCA
// Sorting
