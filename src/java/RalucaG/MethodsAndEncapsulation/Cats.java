package MethodsAndEncapsulation;

import java.util.ArrayList;
import java.util.List;

// starting to create a Lambda example based on OCa
public class Cats {

    private String species;
    private boolean houseCat;
    private boolean wildCat;

    public Cats(String speciesName, boolean house, boolean wild){
        species = speciesName;
        houseCat = house;
        wildCat = wild;

    }

    public boolean isHouseCat() {
        return houseCat;
    }

    public boolean iswildCat() {
        return wildCat;  }

    public String getSpecies() {
        return species;
    }

    public interface CheckType{
        boolean types (Cats c);
    }

    /** public static class CheckIfHouse implements CheckType{
     public boolean types(Cats c){
     return c.isHouseCat();
     }
     }

     public class CheckIfWildimplements  implements CheckType{
     public boolean types (Cats c){
     return c.iswildCat();
     }

     }
     /* *
     *
     * @param args
     */



}

// needs some more work done because I can't figure out what's going on here.