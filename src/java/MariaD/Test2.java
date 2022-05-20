package MariaD;

public class Test2 {
    public static void main(String[] args) {
        //q20
        //output: greatgood
         final char a = 'A', d = 'D';
         char grade = 'B';
         switch(grade) {
             case a:
             case 'B':
                 System.out.print("great");
             case 'C':
                 System.out.print("good");
                 break;
             case d:
             case 'F':
                 System.out.print("not good");
         }}}

      /*  //q19
        //output 36
        int m = 9, n = 1, x = 0;
        while(m > n) {
            m--;
            n += 2;
            x += m + n;
        } System.out.println(x);}}
       */
     /*   //q18
        // output 2
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0)
                    continue ROW_LOOP;
                count++;
            }
        System.out.println(count);
    }}
      */
  /*   //q17
       // Output:11
        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if(i==8) keepGoing = false;
            result -= 2;
        } while(keepGoing);
        System.out.println(result);
    }}
*/
     /*   //q16
        // output: java: cannot find symbol, symbol:   variable y
        //D. The code will not compile because of line 6.
        do {
           int y = 1;
           System.out.print(y++ + " ");
           } while(y <= 10);}}
*/
     /*   //q15
        int x = 1, y = 15; while x < 10
        y––;
        x++; System.out.println(x+", "+y);}}
        why this output: ?????
*/
     /*   //q14
        //C. 12
         int c = 7;
         int result = 4;
        result += ++c;
        System.out.println(result);}}
*/
      /*  //Q13
        //A.Success
        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        if (b = true) System.out.println("Success");
        else System.out.println("Failure");
    }}
*/
    /*    //Q 12
        //The code will not compile because of line 5.
        int x = 0;
        String s = null;
        if(x == s) System.out.println("Success"); else System.out.println("Failure");
    }}
*/
    /*
    //q11
    // A.2
    public static void main(String[] args) {
        int x = 5 * 4 % 3;
        System.out.println(x);
    }}
*/

    /*
    //q 10
//The code will not compile because of line 4.
    public static void main(String[] args) {
        byte a = 40, b = 50;
         byte sum = (byte) a + b;
       System.out.println(sum);
        }
    }
*/
    /*
    public static void main(String[] args) {

        int x = 5 * 4 % 3;
        System.out.println(x); }}
 */


