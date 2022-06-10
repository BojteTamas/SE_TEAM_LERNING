package CarmenH.start;

public class MainClass2 {
  public static void main(String[] args) {
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = 10 - i;
      System.out.println(numbers[i]);
    }
  }
}

/*
public class MainClass2
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
           numbers[i] = 9 - i;
            System.out.println(numbers[i]);
        }
    }
}
*/

/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass2
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] list = new String[10];

    for (int i = 0; i < list.length; i++)
    {
      list[i] = reader.readLine();
        System.out.println(list[i]);
     }
  }
}

 */

// Read 10 numbers from the keyboard:
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainClass2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[3];

        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
            System.out.println(list[i]);
        }
    }
}

 */

/*
//Find the smallest element in an array:
import java.io.IOException;

public class MainClass2
{
    public static void main(String[] args) throws IOException
    {
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        for (int i = 1; i < list.length; i++)
        {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println ("Min is " + min);
    }
}

 */
