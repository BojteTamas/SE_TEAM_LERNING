package CarmenH.start;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] MyArrayString = new String[10];

        for (int i = 0; i < 8; i++)
        {
            MyArrayString[i] = reader.readLine();

        }

        for (int i = MyArrayString.length-1 ; i>=0 ; i--)
            System.out.println(MyArrayString[i]);
    }
}


/*
import java.io.BufferedReader;
import java.io.InputStreamReader;


//Array of numbers in reverse order


public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        for (int i = list.length-1; i>=0; i--)
            System.out.println(list[i]);

    }
}
*/


