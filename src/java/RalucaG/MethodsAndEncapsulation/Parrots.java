package MethodsAndEncapsulation;
//Constructors : the method name and parameter list need to match
//constructors need to have different parameters to be overloaded
// combo: constructor with one int parameter and one string-- let's try constructor with one int and two strings
public class Parrots {

    private String color;
    private String name;
    private int height;
    private int weight;

    public Parrots(int weight){
        this.weight = weight;
        color = "red";
        name = "Coco";
    }

    public Parrots(int weight,String color, String name){
        this.weight = weight;
        this.color = color;
        this.name = name;
    }

    public void print(){
        System.out.println(weight + "  " + color + "  " + name);
    }

    public static void main(String[] args){
        Parrots parrot = new Parrots(1,"red","Coco");
        parrot.print();
    }


}
