package CarmenH.may.may31;

public class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]); //call static method

        Koala k = new Koala();
        System.out.println(k.count);
        k = null;
        System.out.println(k.count);

        //Java doesn’t care that k happens to be null. Since we are looking for a static, it doesn’t matter.


        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count);

        //this is very tricky!!!!! count is only one variable
    }
}
