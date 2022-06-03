package CarmenH.june03;

public class Hamster {

    private String color;

    private int weight;

  /*    an incorrect example:
    public Hamster(int weight) {
        Hamster(weight, "brown"); // DOES NOT COMPILE
    }
  !!!!  Constructors can be called only by writing new before the name of the constructor.
         They are not like normal methods that you can just call.

        if we add new it compiles:
     public Hamster(int weight) { //4th constructor -it compiles but it doesn't do what it should
            new Hamster(weight, "brown");
    }
    When the constructor with one parameter is called, it creates an object with the default weight and color.
    It then constructs a different object with the desired weight and color and ignores the new object.
    That's not what we want. We want weight and color set on the object we are trying to instantiate in the first place.

    there is a solution that works:
    public Hamster(int weight) { //3rd constructor - sets weight and color on the object we are trying to instantiate
        this(weight, "brown");
        }
calling the 4th or the 3rd constructor I see the same results. I understand that the difference is that the 3rd constructor uses our initial object, than the 4th constructor that creates a new object
   */

   // public Hamster(int weight) {//4th constructor -it compiles but it doesn't do what it should
 //       new Hamster(weight, "brown");
 //   }

    public Hamster(int weight) { //3rd constructor - sets weight and color on the object we are trying to instantiate
      this(weight, "brown");
        }


  /*
    public Hamster(int weight) { // first constructor
        this.weight = weight;
        color = "brown";
        System.out.println("My hamster has " + this.weight + " grams" );
    }


   */
    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
        System.out.println("My hamster has " + this.weight + " grams and it's color is " + this.color );
    }
    public static void main(String[] args) {
        Hamster hamster = new Hamster( 2, "red");
        Hamster hamsterica = new Hamster ( 213); //if I comment the first  constructor with the 3rd constructor, it calls the second costructor with default color "brown"
    }
}

//The parameter lists are different, so the constructors are successfully overloaded.
