package CarmenH.pond.duck;

public class FatherDuck {

        public String noise = "quack";//changed to public to work
        public void quack() {  //changed to public to work
            System.out.println(noise); // noise is in the same class - it is ok it's private
        }
        private void makeNoise() {
            quack(); //method quack() is private but in the same class - so it is ok
        }
}

