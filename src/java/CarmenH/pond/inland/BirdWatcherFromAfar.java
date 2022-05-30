package CarmenH.pond.inland;
import CarmenH.pond.shore.Bird; // different package than Bird


public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);// DOES NOT COMPILE - text has protected access in 'CarmenH.pond.shore.Bird'
    }
}

/*
Subclasses and classes in the same package are the only ones allowed to access protected members.
 */
