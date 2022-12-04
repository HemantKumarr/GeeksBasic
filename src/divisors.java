import java.util.Scanner;

public class divisors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divide(n);
        System.out.println("------");
        optimize(n);
        optimizesort(n);
    }

    private static void optimizesort(int n) {
        int i;
        for (i=1; i*i < n; i++)
            if (n%i == 0)
                System.out.println(i);
        for( ;i>=1;i--)
            if(n%i==0)
                System.out.println(n/i);
    }

    private static void optimize(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if(i!=n/i)   //for the divisors of perfect squares
                    System.out.println(n/i);
            }
        }
    }

    private static void divide(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}
