package easy;

public class GuessNumberHigherOrLower {

    private final int guessed;

    public GuessNumberHigherOrLower(int guessed) {
        this.guessed = guessed;
    }

    /**
     * 0 ms, 38.46 MB
     */
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (true) {
            int mid = left + (right - left) / 2;
            switch (guess(mid)) {
                case 1 -> left = mid + 1;
                case -1 -> right = mid - 1;
                default -> { return mid; }
            }
        }
    }

    /**
     * 0 ms, 38.82 MB
     */
    public int guessNumber1(int n) {
        return recursion(1, n);
    }

    private int recursion(int left, int right) {
        int mid = left + (right - left) / 2;
        switch (guess(mid)) {
            case -1 -> { return recursion(left, mid - 1); }
            case 1 -> { return recursion(mid + 1, right); }
            default -> { return mid; }
        }
    }

    private int guess(int num) {
        return Integer.compare(guessed, num);
    }
}
