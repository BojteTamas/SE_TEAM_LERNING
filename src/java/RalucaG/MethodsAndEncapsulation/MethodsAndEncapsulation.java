package MethodsAndEncapsulation;

public class MethodsAndEncapsulation {

    /**
     * Remember that a method must have a return type. If no value is returned,
     * the return type is void. You cannot omit the return type.
     * public void walk1() {} -- valid method with no optional specifier
     * public final void walk2() {} -- valid method declaration with final as the specifier
     * public static final void walk3() {} -- method declaration with final as optional specifier
     * public final static void walk4() {} -- method declaration with final as optional specifier
     *
     * When checking return types, you also have to look inside the method body. Methods
     * with a return type other than void are required to have a return statement inside the
     * method body. This return statement must include the primitive or object to be returned.
     *
     * public void walk1() { } -- return type void, return statement optional
     * public void walk2() { return; } -- optional return statement, doesn't return anything
     * public String walk3() { return ""; } - valid method , returns a string
     *
     *
     * you can just have an empty pair of parentheses after the method name, such as void nap(){}. If you do have multiple parameters, you separate them with a comma
     *
     * A method body is simply a code block. It has braces that contain zero or more Java statements.
     *
     

    public static void walk(int start, int ... nums) {

            System.out.println(nums.length);

     }
     
    */
    
    public static void walk(int... nums){
        
    }

    public  static void main(String[] args) {
        walk(1);
        walk(1,2);
        walk(1,2,3);
        walk(1, new int[] {4,5});
    
    }

    private static void walk(int i, int[] ints) {
    }


}
