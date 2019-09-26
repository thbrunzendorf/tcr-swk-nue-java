package tcr;

public class Kata {

    private String scoreA = "love";
    private String scoreB = "love";

    public String getScore() {
        return this.scoreA + ":" + scoreB;
    }

    public void pointForA() {
        if (scoreA.equals("15")) scoreA = "30";
        else
            scoreA = "15";
    }
}
