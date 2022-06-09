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

    public static class CheckIfHouse implements CheckType{
        public boolean types(Cats c){
            return c.isHouseCat();
        }
    }

    public class CheckIfWildimplements  implements CheckType{
        public boolean types (Cats c){
            return c.iswildCat();
        }

    }

    public static void main (String[] args){
        List<Cats> cats = new ArrayList<Cats>();
        cats.add(new Cats("Main Coon",true,false));
        cats.add(new Cats("British shorthair",true,false));
        cats.add(new Cats("Angora",true,false));
        cats.add(new Cats("Scottish Fold",true,false));
        cats.add(new Cats("Sphynx",true,false));

        cats.add(new Cats("Tiger ",false,true));
        cats.add(new Cats("Lion",false,true));
        cats.add(new Cats("Leopard",false,true));
        cats.add(new Cats("Jaguar",false,true));
        cats.add(new Cats("Snow leopard",false,true));

        print(cats, new CheckIfHouse());
        


        //System.out.println(cats + "   ");

    }

    private static void print(List<Cats> cats, CheckIfHouse checkIfHouse) {
        for (Cats cat : cats) {
            if (checkIfHouse.types(cat)) {
                System.out.println(cat + "  ");
            }
        }
        System.out.println();
    }


}

// needs some more work done because I can't figure out what's going on here.