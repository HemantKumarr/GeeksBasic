import java.util.Scanner;

public class gcd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int eu,euo;
        hcf(a,b);
        eu = euclid(a,b);
        euo = euclidoptimize(a,b);
        System.out.println(eu + " " + euo);
    }

    private static int euclidoptimize(int a, int b) {
        if (b==0)
            return a;
        else
            return euclidoptimize(b,a%b);
    }

    private static int euclid(int a, int b) {
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    private static void hcf(int a, int b) {
        int small = Math.min(a,b);
        while(small>0){
            if(a%small==0 && b%small==0)
                break;
            small--;
        }
        System.out.println(small);
    }
}
