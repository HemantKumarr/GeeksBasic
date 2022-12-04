import java.util.Scanner;

public class kthbitset {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        checkkbit(n,k);
    }

    private static void checkkbit(int n, int k) {
        System.out.println("using right shift");
        int m=n>>(k-1);
        int res = m&1;
        if(res!=0)
            System.out.println("Set bit");
        else
            System.out.println("Not set");

        System.out.println("using left shift");
        int left = 1<<(k-1);
        int res1 = n&left;
        if(res1!=0)
            System.out.println("Set bit");
        else
            System.out.println("Not set");

    }


}
