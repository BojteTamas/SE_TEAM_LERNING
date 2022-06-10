package CarmenH.may;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Carmen6may {
  /*
  Chess board
  */
  public static char[][] array;

  public static void main(String[] args) throws Exception {
    // write your code here

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    int no = Integer.parseInt(s);
    array = new char[no][no];
    int i, j;

    for (i = 0; i < no; i++) {
      for (j = 0; j < no; j++) {
        if ((i % 2) != 0) {
          if ((j % 2) == 0) array[i][j] = ' ';
          else array[i][j] = '#';

        } else {
          if ((j % 2) == 0) array[i][j] = '#';
          else array[i][j] = ' ';
        }
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
  }
}

/*
Cutting down the middle
*/
    /*
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

        public static void main(String[] args) {
            printArray();
            //write your code here
            for (int i = 1; i < chars.length-1; i++)
                for (int j = 1; j < chars[i].length-1; j++)
                    chars[i][j]='-';

            printArray();
        }

        private static void printArray() {
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars[i].length; j++) {
                    System.out.print(chars[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


         */

     /*
     Multiplication table
     */
 /*

     public static int[][] MULTIPLICATION_TABLE;

     public static void main(String[] args) {
         //write your code here
         //int[][] multiplicationTable = MULTIPLICATION_TABLE[10][10];
         MULTIPLICATION_TABLE = new int[10][10];
         int i,j;

         for (i = 0; i < 10; i++) {
             for (j = 0; j < 10; j++) {
                 multiplicationTable[i][j] = (i + 1) * (j + 1);
                 System.out.print(multiplicationTable[i][j]+" " );
             }
             System.out.println();
         }

     }

 */
/*
2 arrays
*/
    /*
       public static void main(String[] args) throws Exception {
           //write your code here
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String[] list_s = new String[10];
           int[] list_i = new int[10];

           for (int i = 0; i < list_s.length; i++)
           {
               String s = reader.readLine();
               list_s[i] = s;
               list_i[i]=list_s[i].length();
               System.out.println(list_i[i]);
           }
       }

    */
