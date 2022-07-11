/*package MariaD.july.july_11;
/*
pay attention to return types when writing immutable classes
encapsulation refers to preventing callers from changing the instance variables directly.
Immutability refers to preventing callers from changing the instance variables at all.
 */

/*class NotImmutable{
    private StringBuilder builder;
    public NotImmutable(StringBuilder b){
        builder = b;
    }
    public StringBuilder getBuilder(){
        return builder;
    }

    //create a defensive copy (a copy of mutuable object).

    public  Mutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }
    public StringBuilder getBuilder2() {
        return new StringBuilder(builder);
    }
    public String getValue() {
        return builder.toString();
    }
}
public class Immutable3 {
    public static void main(String...args){

        StringBuilder sb = new StringBuilder ("Initial");
        NotImmutable problem = new NotImmutable(sb);
        sb.append(" added");
        StringBuilder gotbuilder = problem.getBuilder();
        gotbuilder.append(" more");
        System.out.println(problem.getBuilder());//Initial added more we are passing the same stringbuilder all over

     //   the caller has a reference since it was passed to the constructor.
     //   when we use stringbuilder.append, we ammend/append the reference, it is not immutable anymore
     //   create a defensive copy (a copy of mutuable object).

        Mutable mutable = new Immnutable

        }
    }
    verifica maine exemplul, probleme linia 19
    */
