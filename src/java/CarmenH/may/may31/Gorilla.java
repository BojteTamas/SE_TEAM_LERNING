package CarmenH.may.may31;

public class Gorilla { //created parameter

    public static int count;

    public static void addGorilla() {
        count++;
    }

    public static void babyGorilla() { //made the method static
        count++;
    }
    public static void announceBabies() {
        addGorilla();
        babyGorilla();
    }
    public static void announceBabiesToEveryone() {
        addGorilla();
        babyGorilla(); // DOES NOT COMPILE - non-static method babyGorilla cannot be referenced from a static context
    }
    public static int total; //made static

    public static int  average= total/count;  // DOES NOT COMPILE //made static

    public static void main(String[] args) {
        announceBabies();
        announceBabiesToEveryone();
        System.out.println(average);
    }

}
//made it to compile but I don't know how total and count are modified . Also how we use announce methods?