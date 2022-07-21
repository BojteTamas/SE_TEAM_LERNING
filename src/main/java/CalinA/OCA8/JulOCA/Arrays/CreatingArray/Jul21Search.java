package CalinA.OCA8.JulOCA.Arrays.CreatingArray;

public class Jul21Search {
  public static int search(int arr[], int x) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = {10, 20, 30, 40, 50};
    int x = 30;
    int result = search(arr, x);
    if (result == -1) System.out.print("Element not found.");
    else System.out.print("Element present at index: " + result);
  }
}
// Read from OCA
// Search
