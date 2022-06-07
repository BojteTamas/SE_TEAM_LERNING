package CarmenH.june07;

public class Swan {
    private int numberEggs; // private - the instance variable

    public int getNumberEggs() { // getter = accessor method
        return numberEggs;

    }

    public void setNumberEggs(int numberEggs) { // setter = mutator method
        if (numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs;
        // we used the this keyword that we saw in constructors to differentiate between the method parameter numberEggs and
        // the instance variable numberEggs.
    }

    public static void main(String[] args) {
        Swan lebaduta = new Swan();
        lebaduta.setNumberEggs(5);
        System.out.println(lebaduta.getNumberEggs()); //first I printed the reference, only lebaduta - after that used the reference to call the getter
    } // added void main to compile the code and managed to use the methods from the book . YEYY!!

}
