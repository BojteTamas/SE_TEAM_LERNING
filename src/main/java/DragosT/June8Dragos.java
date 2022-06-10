package DragosT; /*public class June8Dragos {
                 //    access modifiers

                 //public The method can be called from any class.
                 //private The method can only be called from within the same class.
                 //protected The method can only be called from classes in the same package or subclasses.
                     // default is that a method can only be called from classes in the same package
                 public void walk1() {} // valid method
                 default void walk2() {} // DOES NOT COMPILE default is not a valid access modifier, no need to declare default
                 void public walk3() {} // DOES NOT COMPILE type before access modifier will not compile public void walk3() {} is good
                 void walk4() {} // this is the default access and will run


                 //    optional specifiers
                 //static - Used for class methods.
                 //abstract - Used when not providing a method body.
                 //final - Used when a method is not allowed to be overridden by a subclass.
                 //synchronized - Used when if an object is visible to more than one thread, all reads or writes to that object's variables are done through synchronized methods
                 //native - Used when interacting with code written in another language such as C++.
                 //strictfp - Used for making floating-point calcu- lations portable.

                 public void method1() {} // no optional specifier but valid
                 public final void method2() {} //valid correct order of optional and type
                 public static final void method3() {} // its posible for 2 optional specifiers to be present in one method
                 public final static void method4() {} // its posible for 2 optional specifiers to be present in one method
                 public modifier void method5() {} // not copiling , modifier does not exisit as optional specifier
                 public void final method6() {} // not compiling, type is not possible to be before optional specifier
                 final public void method7() {} // is it posible for optional specifiers to be in front of access modifiers

                 //Return Type

                 public void name1() { } // since it's void it's ok
                 public void name2() { return; } // since it's void it's ok
                 public String name3() { return ""; } // good since it returns string""
                 public String name4() { } // can't return void and be of type sting, will not compile
                 public name5() { } // no default type needd to be specified, will not compile

                 String name6(int number) { if (number == 4) return ""; } // will not compile since it's only returning something is number == 4 evauate true

                 int long0()
                     {
                     return 9L; // will nor compile since the method is int can't return long
                     }
                 long long1()
                     {
                         return 9L; // should be good ?
                     }


                 }

                  */
