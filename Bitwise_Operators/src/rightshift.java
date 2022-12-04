public class rightshift {

    public static void main(String[] args){
        int x=-64;
        for (int i = 1; i < 6; i++) {
            System.out.println(x >> i);// signed right shift - the leading bits are replaced by 1 for -ve numbers and by 0 for +ve numbers
        }
        System.out.println("-------");
        for (int i = 1; i < 6; i++) {
            System.out.println(x >>> i);  // unsigned right shift - the leading bits are always replaced by 0 so -ve nos become +ve
        }
    }
}
