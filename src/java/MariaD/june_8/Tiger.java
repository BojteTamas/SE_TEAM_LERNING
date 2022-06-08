package MariaD.june_8;
import java.util.*;

//exercises
/*public class Tiger {
    String name;
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        System.out.println(t1 == t1);//true--compares the reference on the same object
        System.out.println(t1 == t2);//false-the 2 object references are different
        System.out.println(t1.equals(t2));//false//Tiger does not implement equals
    }
}
 */
public class Tiger {
    public static void main(String[] args) {
        String t1 = "hello world";
        String t2 = "hello world".trim();
        System.out.println(t1.equals(t2));//true
        System.out.println(t1==t2);//true
    }
}
