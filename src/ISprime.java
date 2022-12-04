import java.util.Scanner;

public class ISprime {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean p,q,r;
        p = naive(n);
        System.out.println(p);
        q=optimize(n);
        System.out.println(q);
        r = optimize2(n);
        System.out.println(r);
    }

    private static boolean optimize2(int n) {
        if(n==1) return false;
        if(n==2|| n==3) return true;
        if(n%2==0||n%3==0) return false;
        for (int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0)
                return false;
        }
        return true;
    }

    private static boolean optimize(int n) {
        for (int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    private static boolean naive(int n) {
        for(int i=2; i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
