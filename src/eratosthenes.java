import java.util.Arrays;
import java.util.Scanner;

public class eratosthenes {
//  to print all the prime numbers in a range
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieve(n);
        System.out.println("------");
        optimize(n);
    }

    private static void optimize(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }
    }

    private static void sieve(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                System.out.println(i);
        }
    }
}
