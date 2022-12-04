import java.util.ArrayList;
public class leftrotate {

    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int k=a[0];
        for (int i = 1; i <a.length ; i++) {
            a[i-1]=a[i];
        }
        a[a.length-1]=k;
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
        System.out.println("------");
        int[] b={7,8,3,6,2,1};
        ArrayList<Integer> e = new ArrayList<Integer>();
        int c=b[b.length-1];
        e.add(b[b.length-1]);
        for (int i = b.length-2; i >=0 ; i--) {
            if(b[i]>=c){
                c=b[i];
                e.add(c);
//                System.out.println(c);
            }
        }
        for (int i = e.size()-1; i >=0 ; i--) {
            System.out.println(e.get(i));
        }

        int p[]={2,5,1,6,4,3,8,15,4};
        int max=0;
        for (int i = 0; i <p.length-1 ; i++) {
            for (int j = i+1; j <p.length-1 ; j++) {
                if ((a[j] - a[i]) > max)
                    max = a[j] - a[i];
            }
        }
        System.out.print(max);
//        int d=2,b=0;
//        for (int i = d; i <a.length ; i++,b++) {
//            a[b]=a[i];
//        }
//        for (int i = b; i <a.length ; i++) {
//            System.out.println(a[i]);
//
//        }
    }
}
