package CarmenH.pond.goose;
import CarmenH.pond.shore.Bird;
public class Goose extends Bird {

    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose();
        other.floatInWater(); // DOES NOT COMPILE
        System.out.println(other.text); // DOES NOT COMPILE
    }
}
/*
Since we are in the Goose subclass and referring to a Goose reference, it can access protected members.
We are not allowed to refer to members of the Bird class since we are not in the same package and Bird is not a subclass of Bird.
 */