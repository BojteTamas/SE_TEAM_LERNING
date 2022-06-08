package CarmenH.june08;

public class Animal {

    private String species; // first instance variable, set in the constructor
    private boolean canHop; // second instance variable, set in the constructor
    private boolean canSwim; // third instance variable, set in the constructor
    public Animal(String speciesName, boolean hopper, boolean swimmer) { //the construcctor
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    public boolean canHop() { return canHop; } // method that gets the state of canHop
    public boolean canSwim() { return canSwim; } // method that gets the state of canSwim
    public String toString() { return species; } //method so we can easily identify the Animal in programs.? how
    }

    /**
     *  to write different checks we need an interface
     * remember that an interface specifies the methods that our class needs to implement
      */
