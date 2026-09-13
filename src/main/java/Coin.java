import java.util.Random;

public class Coin {
    private char coinToss() {
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
                // Break from outliers so program doesn't stall
                if (sumOfHeads + sumOfTails == 10000000) {
                    break;
                }
            }

            cumulativeHeadsRatio += sumOfHeads / (sumOfHeads + sumOfTails);
            double currentMeanOfTrials = cumulativeHeadsRatio / i;

            if (i % 1000 == 0) {
                System.out.println(i + ") " + (currentMeanOfTrials*4));
            }
        }

        meanOfTrials = cumulativeHeadsRatio / n;
        return meanOfTrials * 4;
    }
}
