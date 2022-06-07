package MethodsAndEncapsulation;

public class Boeing747 {

    public static String boeing(String s){
        return "747-8";
    }

    public static String boeing(String... s){
        return "737 MAX";
    }

    public  static String boeing (Object o){
        return "787";
    }

    public static String boeing(String s, String t) {
        return "767";
    }


    public  static void main (String[] args){
        System.out.println(boeing("a"));//calling method with 1 param for string
        System.out.println(boeing("a","b"));//calling method with 2 param for string
        System.out.println(boeing("a","b","c"));//calling method with 1 param for string
    }


}
