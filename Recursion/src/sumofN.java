import java.util.Scanner;

public class sumofN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        int s=0,sum=0;
        boolean bool;
//        s=sum(n);
//        System.out.println(s);
//        bool= palin(str,str.length());
//        System.out.println(bool);
          sum=sumdigits(n);
          System.out.println(sum);
    }

    private static int sumdigits(int n) {
        if(n/10==0) return n;
        else
            return (n%10)+sumdigits(n/10);
    }

    private static boolean palin(String str, int n) {
        if(n==0||n==1) return true;
        if(str.charAt(0)==str.charAt(str.length()-1))
            return palin(str.substring(1,str.length()-1),str.length()-2);
        else
            return false;

    }

    private static int sum(int n) {
        if(n==0)
            return 0;
        return n+sum(n-1);

    }
}
