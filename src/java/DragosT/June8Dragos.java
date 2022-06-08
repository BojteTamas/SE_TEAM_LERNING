public class June8Dragos {
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


}