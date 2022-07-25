package CalinA.OCA8.JulOCA.Arrays.CreatingArray;

public class Jul25Muldimensionarrays2 {
  public static void main(String[] args) {
    int[][] arr = {{5, 6}, {7, 8}};
    for (int x = 0; x < 2; x++) {
      for (int y = 0; y < 2; y++) {
        System.out.print(arr[x][y] + " ");
      }
      System.out.println();
    }
  }
}
