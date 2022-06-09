package MethodsAndEncapsulation;

/**Immutable classes: cannot be changed; they omit the setters; the initial value is still identified but it cannot
 * be changed after the object is created -- we use constructors for this part
 *Immutable classes can have values they just can't changed after the instantiation
 *
 *when writting an immutable class always need to be careful about the return types
 *
 */
public class HospitalEmployee {

    final String badgeNumber;

    public HospitalEmployee(String badgeNumber){
        this.badgeNumber = badgeNumber;
    }

    public String getBadgeNumber(){
        return badgeNumber;
    }



    public static void main(String[] args){
        HospitalEmployee medicover = new HospitalEmployee("RGAL2401");

        String s = medicover.getBadgeNumber();

        System.out.println("Badge number for employee RG is: " + s);

    }

    //the above is immutable: we don't have a setter method, no way to change the value of the variable that was instantiated
    //the class is declared as final -- this means it cannot have a subclass and it cannot change it's value after creating an object


}
