import java.util.Scanner;

public class power {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int res,res1;
//        powe(a,n);
//        res = poweeff(a,n);
//        System.out.println(res);
//        res1 = poweeff1(a,n);
//        System.out.println(res1);
        bina(a,n);
    }

    private static void bina(int a, int n) {
        //        every number can be written as sum of powers of 2 - only for the set bits we are multiplying the powers, the values
//        are getting squared for every iteration.
        int res=1;
        while(n>0){
            if(n%2!=0){
                res*=a;
            }
        n=n>>1;   //  right shift operator      -----   also n=n/2 can be used
        a=a*a;
        }
        System.out.println(res);
    }

    private static void powe(int a, int n){
        int res=1;
        for (int i = 0; i < n; i++) {
            res*=a;
        }
        System.out.println(res);
    }

    private static int poweeff(int a, int n){
        int res=1;
        if(n==0) return 1;
        if(n%2==0) {
            return poweeff(a,n/2)*poweeff(a,n/2);
        }
        else
          return poweeff(a,n-1)*a;
    }

    private static int poweeff1(int a, int n) {
        int res = 1;
        if (n == 0) return 1;
        int temp =  poweeff1(a, n / 2);
        temp = temp * temp;
        if (n % 2 == 0)
            return temp;
        else return temp * a;
    }
}
