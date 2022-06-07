package MethodsAndEncapsulation;
//Constructors : the method name and parameter list need to match
// combo: constructor with one int parameter and one string-- let's try constructor with three strings
public class Butterfly {

    private String coloring;
    private String species;
    private String order;

    public Butterfly(String coloring, String b, String c){
        this.coloring = "blue";
        this.species = "Morpho didius";
        this.order = "Nymphalidae";
    }


    public static void main (String[] args){
        Butterfly b = new Butterfly("a","b","c");
    System.out.println("The following butterfly is from the species " +b.species + "  that is part of the family of  " + b.order + "  and it has the most colorful and eye-catching nuance of " + b.coloring);
}



}
