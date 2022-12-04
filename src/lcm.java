import java.util.Scanner;

public class lcm {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = lcm(a,b);
        lcmnaive(a,b);
        System.out.println(lcm);
    }

    private static void lcmnaive(int a, int b) {
        int big = Math.max(a,b);
        while(true) {
            if (big % a == 0 && big % b == 0){
                System.out.println(big);
                break;
            }
            big++;
        }
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
