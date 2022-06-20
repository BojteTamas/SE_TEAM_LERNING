package CarmenH.classdesignCh5;

public class Rodent {

    protected int tailLength = 4;

    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]"); // this uses the variable from here, parent class
    }

}
