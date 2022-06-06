package MethodsAndEncapsulation;

public class ReferenceTypes {

    public void test(String s){
        System.out.println("String is:...");
    }

    public void test(Object obj){
        System.out.println("Object is:...");
    }

    public static void main(String[] args){
        ReferenceTypes ref = new ReferenceTypes();
       ref.test("string -- calling method test for string"); //does nothing
        ref.test(24);// calling method test for object -- does nothing

        System.out.println(ref);// just prints out referencetypes as value?? not really sure
    }

}
