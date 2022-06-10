package MethodsAndEncapsulation;

public class CheckIfWild implements Cats.CheckType {
    public boolean types(Cats c) {
        return c.iswildCat();
    }
}
