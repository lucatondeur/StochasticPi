import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of iterations you would like to run: ");
        long n = s.nextLong();
        Coin coin = new Coin();
        System.out.println(coin.monteCarlo(n));
    }
}
