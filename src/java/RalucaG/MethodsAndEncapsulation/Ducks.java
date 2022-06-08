package MethodsAndEncapsulation;

public class Ducks {

    private static int numberOfChicks;
    public int getNumberOfChicks(){
        return numberOfChicks;
    }

    public void setNumberOfChicks(int numberOfChicks) {
        if (numberOfChicks >= 0 && numberOfChicks <= 99) {
            this.numberOfChicks = numberOfChicks;
        }
    }

    public static void main(String[] args){
        Ducks ducks = new Ducks();
        System.out.println("How many duck chicks are there?" + numberOfChicks);

    }


    // really need to spend some more time on this getter and setter for encapsulation,not quite clear

}
