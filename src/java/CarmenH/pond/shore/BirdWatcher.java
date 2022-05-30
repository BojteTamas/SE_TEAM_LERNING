/*
protected also gives us access to everything that default access does.
This means that a class in the same package as Bird can access its protected members.
 */
package CarmenH.pond.shore;  // same package as Bird


public class BirdWatcher {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // calling protected member
        System.out.println(bird.text); // calling protected member
    }
}

