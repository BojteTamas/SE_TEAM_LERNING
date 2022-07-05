package CarmenH.classdesignCh5;

public class OverloadingConstructors {
    private String color = "rosu";
    private int weight = 99;
    private String genre ;

    public OverloadingConstructors(int weight) {  //SAME
        this.weight = weight;
        color = "brown";
    }
    // this second constructors is valid but duplicates the first but is valid to show overloading
    public OverloadingConstructors(int weight, String color, String genre) {
        this.weight = weight;
        this.color = color;
        this.genre = genre;
    }

    // We can build it like this (Not working ask about)
    //    public OverloadingConstructors(int weight) { //SAME
    //        this(weight,"brown",genre);
    //    }
    /**
     Two reasons why doesn't work:
    1. the method has the same number of arguments as the one above
    "Overloaded methods may have the same or different return types, but they must differ in parameters."
    2. the third parameter should be string "f" not genre.
     */

    public OverloadingConstructors(int weight, String color) {
        this(weight,"brown","f");
    }
    public static void main(String[] args) {
        OverloadingConstructors referinta_mea = new OverloadingConstructors(19, "oranj");
        System.out.println("soarecele meu are culoarea " + referinta_mea.color + " , are " + referinta_mea.weight + " grame iar genul este: " + referinta_mea.genre);
    }



}
///page 291 test 5