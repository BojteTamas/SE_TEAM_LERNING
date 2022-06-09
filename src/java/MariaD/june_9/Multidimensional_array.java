package MariaD.june_9;
import java.util.Arrays;

import static java.lang.Long.sum;


/*public class Multidimensional_array {
    public static void main(String[] args){
        //declaring & initializing a 2d array:
        int maria_array[][] = { {9,5,7},{3,8,6} ,{1,4,2} };
        //printing 2d array
        for (int a = 0; a<3; a ++)
        {
            for (int b= 0; b<3; b++)
                System.out.println(maria_array[a][b] + "yeeey");//{9yeey, 5 yeey, 7yeey}.....
            System.out.println();
        }
    }
}
 */
public class Multidimensional_array {
    public static void main(String[] args) {
        int[][] multi_array = new int[10][20];
        for(int i=0; i< multi_array.length; i++) {
            for (int j = 0; j < multi_array[i].length; j++) {
                System.out.println("i:" + i + ",j:" + j);//output toate variantele posibile de la i:0,j:0 ........i:9,j:19
            }
        }
    }
}

///SUM OF ARRAYS
/*public class Multidimensional_array {
    public static void main(String[] args){
        int[] declaration = {3, 4, 5, 9};

        //passing arrays to method m1
        sum(declaration);
    }
    private static void sum(int[] declaration) {
        int sum = 0;
        for (int i = 0; i < declaration.length; i++)
            sum += declaration[i];
        System.out.println("sum of values : " + sum);///sum of values : 21
    }
}
 */