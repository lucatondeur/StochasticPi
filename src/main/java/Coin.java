import java.util.Random;

public class Coin {
    public char coinToss() {
        Random r = new Random();
        if (r.nextBoolean()) {
            return 'h';
        } else {
            return 't';
        }
    }

    public double monteCarlo(long n) {
        double cumulativeHeadsRatio = 0;
        double meanOfTrials = 0;

        for (int i = 1; i <= n; i++) {

            double sumOfHeads = 0;
            double sumOfTails = 0;

            while (sumOfHeads <= sumOfTails) {
                if (coinToss() == 'h') {
                    sumOfHeads++;
                } else {
                    sumOfTails++;
                }
            }

            cumulativeHeadsRatio += sumOfHeads / (sumOfHeads + sumOfTails);
            double currentMeanOfTrials = cumulativeHeadsRatio / i;
        }

        meanOfTrials = cumulativeHeadsRatio / n;
        return meanOfTrials * 4;
    }
}
