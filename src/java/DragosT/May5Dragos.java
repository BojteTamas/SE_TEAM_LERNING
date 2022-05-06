public class May5Dragos {
//    Imutability of strings and workarounds(can mutate strings using classes)
    class Mutable {
        private String s;
        public void setS(String newS){ s = newS; } // Setter makes it mutable
        public String getS() { return s; }
    }
    final class Immutable {
        private String s = "name";
        public String getS() { return s; } }
//      having only a getter keeps the strin imutable

//Strimg Pools and how they work
    //a string pool will kepp multiple strings inside a string object to save memory
    String name = "Fluffy"; //String pool use case
    String name = new String("Fluffy");// creates new string obj, less efficient

}