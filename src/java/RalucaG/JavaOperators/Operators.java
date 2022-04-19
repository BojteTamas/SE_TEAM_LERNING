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

//18 Apr 2022
// left-hand boolean expression was true only j was incremented
      int j=1;
        int z=1;

        final int w = j<10 ? j++ : z++;
        System.out.println(j + " , " + z);

//left-hand boolean expression evaluates to false only z was incremented
       int j=1;
       int z=1;
       final int w = j >10 ? j++ : z++;
       System.out.println(j + " , " + z);


    }

    int roomInBelly = 5;
    public void eatCheese(int bitesOfCheese){
        while (bitesOfCheese > 0 && roomInBelly > 0){
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");

        //infinite loops -- the do-while statement

       int r = 0;
        do {
            r++;
        } while (false);
        System.out.println(r);

        //19 Apr 2022

        // the for statement - the basic for statement

        //print numbers 0 to 9

        for (int i =0; i< 10; i++){
            System.out.println(i + " ");
        }


        int x = 0;
        for (long y = 0, z = 4; x <5 && y < 10; x++, y++) {
            System.out.println(y + "  Y ");
        }
        System.out.println(x + "  X");

        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for (String value : values){
            System.out.println(value + " , ");
        }


      //compare for and for each loops

      for (String name:names){
          System.out.println(name + " ,");
      }
      for (int i=0; i <names.length; i++){
          String name = names[i];
          System.out.println(name + " ,");
      }

      //objects that inherit java.lang.Iterable

        for(int value : values){
            System.out.println(value + " ,");
        }

        for(java.util.Iterator<Integer> i = values.iterator();i.hasNext();){
            int value = i.next();
            System.out.println(value + " ,")
        }

        int[] values = new int[3];
        values[0] = 10;
        values[1] = new Integer(5);
        values[2] = 15;

        for (int i=1; i<values.length;i++){
            System.out.println(values[i] - values[i-1]);
        }

    }



}
