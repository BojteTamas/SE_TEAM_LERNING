package MethodsAndEncapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static MethodsAndEncapsulation.CatsSearch.print;

public class PredicateSearch {

    public static void main(String[] args){
        List<Cats> cats = new ArrayList<Cats>();
        cats.add(new Cats("Main Coon",true,false));

        print(cats, c -> c.isHouseCat());
    }

    /**
    private static void print(List<Cats> cats, Predicate<Cats> Cats.checkIfHouse){
        for (Cats cat : cats){
            if Cats.checkIfHouse.
        }
    }

     */
}
