public class WordMatch {

    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
      secret = word;
    }

    public int scoreGuess(String guess) {
            int count = 0;
        int len = guess.length();
        for (int i = 0; i <= secret.length() - len; i++) {
            if (guess.equals(secret.substring(i, i + len))) {
                count++;
            }
        }
        return len * len * count;
        }

    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            return (guess1.compareTo(guess2) >= 0) ? guess1 : guess2;
        }
    }
}