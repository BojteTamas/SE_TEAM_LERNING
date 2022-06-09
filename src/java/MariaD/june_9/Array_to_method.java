package MariaD.june_9;
import java.util.Arrays;


public class Array_to_method {
    //driver method
    public static void main(String[] args) {
        int[] ares = m1();
        for (int a= 0; a < ares.length; a++)
            System.out.println(ares[a]+ " " );
    }
    public static int[] m1(){
        //returning array
        return new int[]{1,2,3};////1,2,3
    }
}
