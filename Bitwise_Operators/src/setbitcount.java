import java.util.Scanner;

public class setbitcount {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count(n);
        briankerningham(n);

    }

    private static void briankerningham(int n) {
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        System.out.println(c);
    }

    //1011
    private static void count(int n) {
        int temp = n & 1, c = 0;
        while (n > 0) {
            if ((n&1) == 1) // if block can be replaced with c = c+(n&1);
                c++;
            n = n >> 1;
        }
        System.out.println(c);
    }

}
