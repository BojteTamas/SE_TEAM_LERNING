package MethodsAndEncapsulation;

import static java.lang.System.out;
import static java.lang.Math.*;

public class UsingStaticImports {

    public static void main(String args[])
    {

        double var1 = sqrt(25.0);
        double var2 = tan(90);
        int var3 = absExact(72);
        int var4 = max(72,105);

        out.println("Square of 25 is: " + var1);
        out.println("Tan of 90 is: "+ var2);
        out.println("Absolute value is: " + var3);
        out.println("Maximum of the two numbers is: " + var4);
    }


}
