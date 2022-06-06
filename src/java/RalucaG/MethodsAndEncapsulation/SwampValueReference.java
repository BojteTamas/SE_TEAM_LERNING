package MethodsAndEncapsulation;

public class SwampValueReference {

    static class Pointer{
     public int x,y,z;
    }

public static void main(String[] args){

Pointer pointer = new Pointer();
    System.out.println("Initial: x value is: " + pointer.x + "   , y value is:  " + pointer.y );
    swapPointer(pointer);

    System.out.println("Initialized: x value is: " + pointer.x + "   , y value is:  " + pointer.y );

    swapPointerRef(pointer);
    System.out.println("Swapped: x value is: " + pointer.x + "   , y value is:  " + pointer.y );





}

    public static void swapPointer (Pointer pointer){

        pointer.x = 45;
        pointer.y = 55;

    }

    public static void swapPointerRef(Pointer pointer){
        pointer.z = pointer.x;
        pointer.x = pointer.y;
        pointer.y = pointer.z;

    }


}
