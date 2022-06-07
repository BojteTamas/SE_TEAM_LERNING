package CarmenH.june07;

public class ImmutableSwan {

    private int numberEggs;

    public ImmutableSwan(int numberEggs) { //there is a contructor that allows a value to be set
        this.numberEggs = numberEggs;
    }

    public int getNumberEggs() {
        return numberEggs;
    }

    public static void main (String[] args) {
        ImmutableSwan lebaduta = new ImmutableSwan(99);

        System.out.println(lebaduta.getNumberEggs());
      //  ImmutableSwan lebaduta = new ImmutableSwan(30);

        ImmutableSwan lebaduta2 = new ImmutableSwan(105);
        System.out.println(lebaduta2.getNumberEggs());
    }
}

// this eaxample doesn't have a setter

//!!!Remember, immutable is only measured after the object is constructed.
// Immutable classes are allowed to have values. They just can't change after instantiation.