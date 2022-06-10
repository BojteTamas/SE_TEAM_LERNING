package MariaD.may_june;

public class MariaD_12_may {

  public static void main(String[] args) {

    /// READING ABOUT html from https://www.w3schools.com/HTMl/HTML_BASIC.ASP
    // CONTINUE STATEMENT
    int counter = 10;
    while (counter >= 0) {
      if (counter == 7) {
        counter--;
        continue;
      }
      System.out.print(counter + " ");
      counter--;
    }

    // BREAK STATEMENT SWITCH CASE:
    /*   int num=2;

      switch (num)
      {
          case 1:
              System.out.println("Case 1 ");
              break;
          case 2:
              System.out.println("Case 2 ");
              break;
          case 3:
              System.out.println("Case 3 ");
              break;
          default:
              System.out.println("Default ");
      }

    */

    // break statement - OCA
    /*      int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
         int searchValue = 2;
         int positionX = -1;
         int positionY = -1;
         PARENT_LOOP:
         for(int i=0; i<list.length; i++) {
             for(int j=0; j<list[i].length; j++) {
             if(list[i][j]==searchValue) { positionX = i;
                 positionY = j;
                 break PARENT_LOOP;
               }
             }
         }
         if(positionX==-1 || positionY==-1) {
             System.out.println("Value "+searchValue+" not found"); }
         else {
             System.out.println("Value "+searchValue+" found at: " + "("+positionX+","+positionY+")");
         }
         /*
    */

    // if statement:
    /*      int num=70;
    if( num < 100 ){
        /* This println statement will only execute,
         * if the above condition is true
         */
    // System.out.println("number is less than 100");
    // }
    /*

    */

    /*    int num=70;
    if( num < 100 ){
        System.out.println("number is less than 100");
        if(num > 50){
            System.out.println("number is greater than 50");
        }
    }
    */

    // IF ELSE IF

    /* int num=1234;
    if(num <100 && num>=1) {
        System.out.println("Its a two digit number");
    }
    else if(num <1000 && num>=100) {
        System.out.println("Its a three digit number");
    }
    else if(num <10000 && num>=1000) {
        System.out.println("Its a four digit number");
    }
    else if(num <100000 && num>=10000) {
        System.out.println("Its a five digit number");
    }
    else {
        System.out.println("number is not between 1 & 99999");
    }

    */

  }
}
