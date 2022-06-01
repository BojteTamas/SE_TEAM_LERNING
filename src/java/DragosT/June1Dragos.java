public class June1Dragos {
    //    public static void main(String[] args) {
//        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
//        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
//        performAnimalEnrichment(start, end);
//    }
//    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
//        LocalDate upTo = start;
//        while (upTo.isBefore(end)) { // check if still before end
//            System.out.println("give new toy: " + upTo);
//            upTo = upTo.plusMonths(1); // add a month }}
//        }
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
        performAnimalEnrichment(start, end, period);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { // uses the generic period LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period }}
        }
    }
}