package MethodsAndEncapsulation;

/** to remember:
 * Encapsulation refers to preventing callers from changing the instance variables
 * directly.
 * Immutability refers to preventing callers from changing the instance variables at all
 *
 */
public class NotImmutable {

    private String s;

    NotImmutable(String s){
        this.s = s;
    }

    public String getS(){
        return s;
    }

    public void setS(String notImmu){
        this.s = notImmu;
    }

    public static void main (String[] args){
        NotImmutable obj = new NotImmutable("This is a mutable class :you can modify the values and has getters and setters of the objects");
        System.out.println(obj.getS());

        obj.setS("Mutable class");

        System.out.println(obj.getS());
    }


}
