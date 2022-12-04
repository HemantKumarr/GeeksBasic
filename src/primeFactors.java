import java.util.Scanner;

public class primeFactors {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p,q,r;
        naive(n);
        System.out.println("------");
        optimize(n);
        System.out.println("------");
        optimize2(n);

    }

    private static void optimize2(int n) {
        if (n==1) return;
        while (n % 2 == 0) {
            System.out.println(2);
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.println(3);
            n = n / 3;
        }
        for(int i=5;i*i<=n;i+=6){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if(n>3)
            System.out.println(n);
    }

    private static void naive(int n) {
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0) {
                    System.out.println(i);
                    x = x * i;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    private static void optimize(int n) {
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        System.out.println(n);
    }
}

