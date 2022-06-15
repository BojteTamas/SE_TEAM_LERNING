package CarmenH.june15;

public class Order3 {
    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";
    {
        value3 ="f";
        value2 = "e"; // didn't think a little further that can be more than 2 correct answers :(
        //seems that even it compiles, value2 is not changed here if the object is not created
    }
    static {
        //value2 = "h";
    }

    public static void main(String[] args) {
       // new Order3(); // without this and static block comment then the value2 is 2; with object created value becomes e
        System.out.println(value2);
       // System.out.println(value1); // value1 cannot be initialized if the object is not instantiated

    }
}
// yey - this I really got - some fog got away :D