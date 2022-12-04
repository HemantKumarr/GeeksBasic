public class leftshift {

    public static void main(String[] args){
        int x=-5;
        System.out.println(~x);// 11...11 - 32 ones is a representation of -1, 11...1110 = -2, 11...1011 = -5 and ~5 = 4 i.e 00...0100
        int z = 11;
        System.out.println(~z); // output is -z-1  for -ve n +ve nos
        System.out.println("--------");
        for (int i = 1; i < 6; i++) {
            System.out.println(x << i); // left shift operator multiplies by 2 for small +ve n -ve nos. For large numbers left shift
//   might mess with the sign bit and we may get a different number maybe -ve
        }
        int y=11;
        System.out.println(y<<30);
    }
}
