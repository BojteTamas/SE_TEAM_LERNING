package CalinA.OCA8.JulOCA.Arrays.CreatingArray;

public class Jul19UsinganArray2 {
  public static void main(String[] args) {
    int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) System.out.print(arr[x][y] + " ");
      System.out.println();
    }
  }
}
