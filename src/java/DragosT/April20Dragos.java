public class April20Dragos {
//For each examples
final String[] names = new String[3]; names[0] = "Lisa";
names[1] = "Kevin";
names[2] = "Roger";
for(String name : names) {
    System.out.print(name + ", ");
}

java.util.List<String> values = new java.util.ArrayList<String>(); values.add("Lisa");
values.add("Kevin");
values.add("Roger");
for(String value : values) { System.out.print(value + ", ");
}
//these work because on the right-hand side is an array or Iterable object and the left-hand side has a matching type
//output : Lisa,Kevin, Roger

String names = "Lisa";
for(String name : names) { // DOES NOT COMPILE because names is not an array/list/java.lang.Iterable therfore not iterable
    System.out.print(name + " "); }


}