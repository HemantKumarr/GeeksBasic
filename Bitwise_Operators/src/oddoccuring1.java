import java.util.Scanner;

public class oddoccuring1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,2,1,1,3,3,5,1};
        naive(a);
        xor(a);// ^ - xor operator,  x^0=x, x^y=y^x, x^(y^z)=(x^y)^z , x^x=0
        variation(); // an array of size n contains values from 1 to n+1, hence there is 1 missing value, find it.
    }

    private static void variation() {
        int[] a = {1,4,3,5,2};
        int res=0,res1=0;
        for (int i = 0; i < a.length; i++) {
            res=res^a[i];
        }
        for (int i = 1; i <= a.length+1; i++) {
            res1=res1^i;
        }
        System.out.println(res^res1 );
        System.out.println( res + " " +res1);


    }

    private static void xor(int[] a) {
        int res=0;
        for (int i = 0; i < a.length; i++) {
            res = res^a[i];
        }
        System.out.println(res);
    }

    private static void naive(int[] a) {
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++) {
                if (a[i] == a[j])
                    c++;
            }
            if(c%2!=0)
                System.out.println(a[i]);
        }
    }
}
