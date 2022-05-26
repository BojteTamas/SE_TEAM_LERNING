public class May25Dragos {

//Array List
import java.util.* // import whole package including ArrayList
// import java.util.ArrayList; // import just ArrayList

ArrayList list = new ArrayList();
list.add("hawk"); // [hawk]
list.add(Boolean.TRUE); // [hawk, true]
System.out.println(list); // [hawk, true]



ArrayList<String> safer = new ArrayList<>();
safer.add("sparrow");
safer.add(Boolean.TRUE); // DOES NOT COMPILE arraylist is cast to string only

List<String> birds = new ArrayList<>();
birds.add("hawk"); //[hawk]
birds.add(1, "robin"); //[hawk,robin]
birds.add(0, "blue jay"); //[blue jay,hawk,robin]
birds.add(1, "cardinal"); //[blue jay,cardinal,hawk,robin]
birds.remove(0); //    [cardinal,hawk,robin]
birds.remove("robin"); //[cardinal,hawk]
birds.set(0,"robin");//[robin,hawk]
birds.isEmpty(); // false
birds.size(); // 2
birds.clear();
birds.size(); // []
birds.isEmpty(); //true
birds.contains("hawk"); // false
System.out.println(birds);

//equals
List<String> one = new ArrayList<>();
List<String> two = new ArrayList<>();
one.equals(two); // true
one.add("a");
two.add("a");
one.equals(two); // true
one.add("b");
one.equals(two); // false

}