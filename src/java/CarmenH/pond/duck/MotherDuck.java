package CarmenH.pond.duck;

public class MotherDuck {

   public static String noise = "quack"; //here was default access - modified to public

   public static void quack() {
        System.out.println(noise); //here was default access - modified to public
    }

   private static void makeNoise() {
       quack();
   }

    public static void main(String[] args) {
        makeNoise();
    }
}

//added here void main that is static and I needed to make all static.

