package CarmenH.june01;

public class ReturningValues {

    public static void main(String[] args) {
        int number = 1;
        String letters = "abc";
        number(number); // 1 - this doesn't modify the caller
        //number = number(number); // 2
        letters = letters(letters); //abcd
        System.out.println(number + letters); // 1abcd
    }
    public static int number(int number) {
        number++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
    //Remember that this is happening because of the returned value and not the method parameter.
}

