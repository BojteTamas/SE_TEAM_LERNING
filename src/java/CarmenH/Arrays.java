package CarmenH;

import java.util.Scanner;

public class Arrays {
   public static void main(String[] args) {

//        int [] a;
//        a = new int[5];
//        int[] b ={1 ,2, 3, 4, -5, 23};

       Scanner scanner = new Scanner(System.in);
       int[] numbers ={1 ,2, 3, 4, -5, 23};
//        int length;
//        do {
//            System.out.println("Enter the length:");
//            length=scanner.nextInt();
//        }while ( length < 0);
//
//        int[] numbers = new int[length];
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter number: " + (i+1));
//            int num = scanner.nextInt();
//            numbers[i] = num;
//        }


        //int min;

        if ( numbers.length > 0 ) {
            int min = numbers[0];
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if ( numbers[i] < min) {
                    min = numbers[i];
                }

            }
            System.out.println("max is " + max);
            System.out.println("min is " + min);
        } else {
            System.out.println("Error - array empty!!");
        }

    }
}
