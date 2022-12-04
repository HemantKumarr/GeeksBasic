public class oddoccuringtwice {

    public static void main(String[] args){
        int a[] = {1,3,3,4,4,6,6,7,7};
        odds2(a);

        }

//    int a[] = {1,3,0,4,0,6,0,7,7};int j=a.length-1;
//        for (int i = 0; i < a.length-1; i++) {
//        if (a[i] == 0) {
//            a[j] = a[i];
//            a[i] = a[i + 1];
//            j--;
//        }
//    }
//        for (int k = 0; k < a.length; k++) {
//        System.out.println(a[k]);
//    }
//}
    private static void odds2(int[] a) {
        int xor=0,res=0,res1=0;
        for (int i = 0; i <a.length ; i++) {
            xor=xor^a[i];
        }
        int sb = xor&~(xor-1);
        for (int i = 0; i <a.length ; i++) {
            if((a[i]&sb)!=0)
                res=res^a[i];
            else
                res1=res1^a[i];
        }
        System.out.println(res + " " + res1);

    }
}
