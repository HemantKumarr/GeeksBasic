public class operators {
    public static void main(String[] args){
        int x=5,y=9;
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);

        int []a={10,10,20,20,30,30};
        int c=1,d=0;
        for (int i = 1; i <a.length-1 ; i++) {
            if(a[i-1]==a[i]){
                c++;
                continue;
            }
            System.out.println(a[i-1]+ " " + c);
            if(a[i-1]!=a[i]){
                d++;
            }
            System.out.println(a[i]+ " " + d);

        }
    }
}
