class Scratch {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple.addPrice(50);
        Apple apple2 = new Apple();
        Apple.addPrice(100);
        System.out.println("Apple price " + Apple.applePrice);
    }
    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applesPrice) {
            Apple.applePrice = Apple.applePrice + applesPrice;
        }
    }
}