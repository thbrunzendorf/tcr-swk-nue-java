package tcr;

public class Kata {

    private int scoreA = 0;
    private int scoreB = 0;

    private String scoreMapping[] =
            new String[]{"love", "15", "30", "40"};

    public String getScore() {
        return scoreMapping[scoreA]
                + ":"
                + scoreMapping[scoreB];
    }

    public void pointForA() {
        scoreA++;
    }
}

