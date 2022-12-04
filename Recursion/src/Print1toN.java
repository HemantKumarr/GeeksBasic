import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        prinN(n);
    }

    private static void prinN(int n) {
        if(n==1)
            System.out.println(n);


    }
}
