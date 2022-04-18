public class Dragos15Aprilie {

//   How break; statement works
//    With a value of dayOfWeek of 5, this code will output: Weekday
//    The first thing you may notice is that there is a break statement at the end of each case and
//    default section. We’ll discuss break statements in detail when we discuss loops, but for now all
//    you need to know is that they terminate the switch statement and return flow control to the enclosing
//    statement. As we’ll soon see, if you leave out the break statement, flow will continue to the next
//    proceeding case or default block automatically.

    int dayOfWeek = 5; switch(dayOfWeek) {
        default: System.out.println("Weekday"); break;
        case 0: System.out.println("Sunday"); break;
        case 6: System.out.println("Saturday"); break;
    }
// next example
    int dayOfWeek = 5;
    switch(dayOfWeek){
        case 0:
            System.out.println("Sunday");
        default:
            System.out.println("Weekday");
        case 6:
            System.out.println("Saturday");
            break;
    }
//This means that for the given value of day- OfWeek, 5, the code will jump to the default block
// and then execute all of the proceeding case statements in order until it finds a break statement
// or finishes the structure:
//Weekday Saturday
//The output of this example with dayOfWeek set to 6 would be:
//    Saturday
//Finally, if the value of dayOfWeek was 0, all three statements would be output: Sunday
//    Weekday Saturday
// all the cases must be of the same type

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia"; final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test": return 52;
            case middleName: // DOES NOT COMPILE id = 5;
                break; case suffix:
                id = 0;
                break;
            case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMPILE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id=15;
                break; }
        return id; }

}

