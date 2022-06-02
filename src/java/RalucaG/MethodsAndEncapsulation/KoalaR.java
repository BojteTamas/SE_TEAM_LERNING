package MethodsAndEncapsulation;

/**
 * Remember that a method must have a return type. If no value is returned,
 * the return type is void. You cannot omit the return type.
 * public void walk1() {} -- valid method with no optional specifier
 * public final void walk2() {} -- valid method declaration with final as the specifier
 * public static final void walk3() {} -- method declaration with final as optional specifier
 * public final static void walk4() {} -- method declaration with final as optional specifier
 * <p>
 * When checking return types, you also have to look inside the method body. Methods
 * with a return type other than void are required to have a return statement inside the
 * method body. This return statement must include the primitive or object to be returned.
 * <p>
 * public void walk1() { } -- return type void, return statement optional
 * public void walk2() { return; } -- optional return statement, doesn't return anything
 * public String walk3() { return ""; } - valid method , returns a string
 * <p>
 * <p>
 * you can just have an empty pair of parentheses after the method name, such as void nap(){}. If you do have multiple parameters, you separate them with a comma
 * <p>
 * A method body is simply a code block. It has braces that contain zero or more Java statements.
 * <p>
 * <p>
 * <p>
 * public static void walk(int start, int ... nums) {
 * <p>
 * System.out.println(nums.length);
 * <p>
 * }
 * <p>
 * <p>
 * <p>
 * public static void walk(int... nums){
 * <p>
 * }
 * <p>
 * public  static void main(String[] args) {
 * walk(1);
 * walk(1,2);
 * walk(1,2,3);
 * walk(1, new int[] {4,5});
 * <p>
 * }
 * <p>
 * private static void walk(int i, int[] ints) {
 * }
 * <p>
 * a method may use a vararg parameter (variable argument) as if it is an array. It is a little different than an array, though. A vararg parameter
 * must be the last element in a method’s parameter list. This implies you are only allowed to
 * have one vararg parameter per method.
 * <p>
 * <p>
 * Applying access Modifiers
 * private: only accessible within the same class
 * default(package private) access: private and other classes in the same package
 * protected:default access and child classes
 * public:protected and classes in the other packages
 * <p>
 * <p>
 * //31.05.2022
 * <p>
 * public static void main(String[] args) {
 * <p>
 * <p>
 * class Fatherducky {
 * private String noise = "quack";
 * <p>
 * private void quack() {
 * System.out.println(noise);
 * }
 * <p>
 * private void makeNoise() {
 * quack();
 * }
 * }
 * <p>
 * class BadDuckling {
 * public void makeNoise() {
 * Fatherducky duck = new Fatherducky();
 * duck.quack();
 * System.out.println(duck.noise);
 * }
 * }
 * <p>
 * <p>
 * /*** Default Access (Package private)
 * package pond.duck;
 * public class MotherDuck{
 * String noise = "quack";
 * void quack(){
 * System.out.println(noise);
 * }
 * private void makeNoise(){
 * quack();
 * }
 * }
 * <p>
 * package pond.duck;
 * public class GoodDuckling{
 * public void makeNoise(){
 * MotherDuck duck = new MotherDuck();
 * duck.quack();
 * System.out.println(duck.noise);
 * }
 * }
 * <p>
 * there is no access modifier, only classes in the same package can access it
 * <p>
 * Protected access
 * <p>
 * package pond.shore;
 * public class Bird{
 * protected String text = "floating";
 * protected void floatInWater(){
 * System.out.println(text);
 * }
 * }
 * <p>
 * package pond.goose;
 * import pond.shore.Bird
 * public class Gosling extends Bird {
 * public void swim(){
 * floatInWater();
 * System.out.println(text);
 * }
 * }
 */

public class KoalaR {
    public static int counter = 0;

    public static void main(String[] args) {
        System.out.println(counter);


    }

}
