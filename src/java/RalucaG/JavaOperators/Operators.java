package JavaOperators;

public class Operators{
    public static void main(String[] args) {
        int number;
        number = 5;
        if (number > 0) {
            number = number * 2;
        } else if (number < 0) {
            number = number + 1;
        }
        System.out.println(number);

        int hourOfDay = 9;
        if(hourOfDay <11 ){
            System.out.println("Good Morning");
        }else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        }else {
            System.out.println("Good Evening");
        }
// ternary operator
        int y = 10;
        final int x;
        if (y > 5) {
            x = 2 * y;

        }else {
            x = 3 * y ;
        }
        System.out.println("x is: " + " " + x);
// left-hand boolean expression was true only j was incremented
    /*    int j=1;
        int z=1;

        final int w = j<10 ? j++ : z++;
        System.out.println(j + " , " + z);
*/
//left-hand boolean expression evaluates to false only z was incremented
       int j=1;
       int z=1;
       final int w = j >10 ? j++ : z++;
       System.out.println(j + " , " + z);


    }
}
