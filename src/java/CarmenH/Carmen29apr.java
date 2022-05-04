package CarmenH;

public class Carmen29apr {
    public static void main(String[] args) {

        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int ii = (int) (Math.random() * RANKS.length);
        int jj = (int) (Math.random() * SUITS.length);
        System.out.println(RANKS[ii] + " of " + SUITS[jj]);

        String[] deck = new String[RANKS.length * SUITS.length];
        for (int i = 0; i < RANKS.length; i++)
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
                System.out.println(RANKS[i] + " of " + SUITS[j]);
            }
    }
}
