import java.util.Scanner;

public class powerset {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        set(str);
    }

    private static void set(String str) {
        int a = str.length();
        double p = Math.pow(2,a);
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < a ; j++) {
                int bit = i&(1<<j);
                if(bit!=0){
                    System.out.print(str.charAt(j));
                }
            }
        System.out.println();
        }
    }
}
