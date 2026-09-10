import java.util.Random;
import java.util.Scanner;

public class Coin {
    public char coinToss() {
        Random r = new Random();
        if (r.nextBoolean()) {
            return 'h';
        } else {
            return 't';
        }
    }
}
