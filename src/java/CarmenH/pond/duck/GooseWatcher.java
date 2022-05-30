package CarmenH.pond.duck;
import CarmenH.pond.goose.Goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
        goose.floatInWater(); // DOES NOT COMPILE
    }
}
