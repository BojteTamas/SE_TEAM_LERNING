package CarmenH.pond.shore;

public class Bird {

    public String text = "floating"; // protected initially

    public void floatInWater() { // protected initially
        System.out.println(text);
    }
}
/*
Subclasses and classes in the same package are the only ones allowed to access protected members.
 */