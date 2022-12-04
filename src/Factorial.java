import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fact;
        int n =sc.nextInt();
        System.out.println("Using iterative method");
        iterFact(n);
        System.out.println("Using recursive method");
        fact=recurFact(n);
        System.out.println(fact);
        zeroes(n);
    }

    public static void iterFact(int n){
        int fact1=1;
        for(int i=1;i<=n;i++){
            fact1*=i;
        }
        System.out.println(fact1);
    }

    public static int recurFact(int n){
        //here time complexity is same as iterative method but has auxiliary space complexity of O(n) because of recursive function calls
        if (n==0)
            return 1;
        return n*recurFact(n-1);
    }

    public static void zeroes(int n){
        int res=0;
        for(int i=5;i<=n;i*=5){
            res+= n/i;
        }
        System.out.println(res);
    }
}
