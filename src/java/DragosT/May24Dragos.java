public class May24Dragos {

    public static void main(String[] args)
    public static void main(String args[])
    public static void main(String... args) // varargs variable arguments

    int[][] vars1; //2D array
    int vars2 [][]; //2D array
    int[] vars3[]; //2D array
    int[] vars4 [], space [][]; // a 2D AND a 3D array

    String [][] rectangle = new String[3][2]; // array with 3 column and 2 lines

    int [][] args = new int[4][]; // arrays of arrays confer multidimesionality in java
    args[0] = new int[5];
    args[1] = new int[3];

    int[][] twoD = new int[3][2];
    for (int i = 0; i < twoD.length; i++) {
        for (int j = 0; j < twoD[i].length; j++)
            System.out.print(twoD[i][j] + " "); // print element
        System.out.println(); // time for a new row
    }



}