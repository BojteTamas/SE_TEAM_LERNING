package MethodsAndEncapsulation;

import java.util.ArrayList;
import java.util.List;

public class CatsSearch {

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

        //print(cats, new CheckIfHouse());

        print(cats, c -> c.isHouseCat());
        print(cats, c -> c.iswildCat());

        print(cats,c -> !c.iswildCat());

        //System.out.println(cats + "   ");

    }

    public static void print(List<Cats> cats, Cats.CheckType checkIfHouse) {
        for (Cats cat : cats) {
            if (checkIfHouse.types(cat)) {
                System.out.println(cat + "  ");
            }
        }
        System.out.println();
    }

}
