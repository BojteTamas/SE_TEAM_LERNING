package CarmenH.classdesignCh5;

public class Mouse extends Rodent {

    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails(); // this uses the variable from parent class, because the method is in parent class
        mouse.getMouseDetails(); // this one uses the variable from child class first time, and second, using super, uses the variable from parent class
    }
}
/**
 * conclusion:
 *
 * !!! do not use hiding variables in practice :)))
 */