package MethodsAndEncapsulation;

public class KoalaTesterR {

    public static void main(String[] args){
        KoalaR.main(new String[0]);

        KoalaR k = new KoalaR();
        System.out.println(KoalaR.counter);

        k = null;
        System.out.println(k.counter);

        KoalaR.counter = 4;
        KoalaR koala1 = new KoalaR();
        KoalaR koala2 = new KoalaR();
        koala1.counter = 6;
        koala2.counter = 5;

        System.out.println(KoalaR.counter);

    }
}
