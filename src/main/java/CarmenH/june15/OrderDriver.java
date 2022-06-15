package CarmenH.june15;

public class OrderDriver {
    public static void main(String[] args) {
        System.out.print(Order.result + " "); // we do not have an object so we print the result u - only the statics
        System.out.print(Order.result + " "); // result is the same because the static initialization is only run once
        new Order(); // an object is created and we have u from static and cr from instance initialization - triggers instance initializers
        new Order(); //another object is created and we have ucr from previous object static and added c and r from running again the instance initialization
        System.out.print(Order.result + " "); // and we print ucrcr
    }
}
/**
 *
 * https://coderanch.com/t/692175/certification/order-initialisers
 */