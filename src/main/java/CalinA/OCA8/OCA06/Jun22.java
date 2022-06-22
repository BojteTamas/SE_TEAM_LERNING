package CalinA.OCA8.OCA06;

public class Jun22 {
  public static void print(int mat[][]) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) System.out.print(mat[i][j] + " ");
      System.out.println();
    }
  }

  public static void main(String[] args) throws IOException {
    int mat[][] = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12}
    };
    print(mat);
  }
}

//Read from OCA
//        Nested Loops
