package CarmenH.ExceptionsCh6;

public class Exception_new_example {

    public static void main(String... args) throws Exception {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new Exception(); //this is the last to be thrown -- all the rest are forgotten
        }
    }
}