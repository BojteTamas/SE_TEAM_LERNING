package MethodsAndEncapsulation;

public class WithoutStaticImports {
    public static void main(String args[])
    {
        double var1 = Math.sqrt(25.0);
        double var2 = Math.tan(90);

        int var3 = Math.absExact(72);
        int var4 = Math.max(72,105);

        System.out.println("Square of 25 is: "+ var1);
        System.out.println("Tan of 90 is: "+ var2);

        System.out.println("Absolut value is: " + var3);
        System.out.println("Maximum of the two numbers is: " + var4);
    }



}
