package CarmenH.start;

public class MainClass1
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
    }
}

/*
public class MainClass1
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
           numbers[i] = i;
        }
    }
}
 */