package com.company;

import java.util.Scanner;

public class countDigits {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int digits;
        boolean pal;
        int n = sc.nextInt();
        digits=counter(n);
        System.out.println("Number of digits "+ digits);
        pal=isPal(n);
        System.out.println("Palindrome "+ pal);
    }

    private static boolean isPal(int n) {
        // actual variable is stored in temp so that later the actual variable(n) can be used for comparison
        int rev=0,d=0,temp=n;
        while (temp!=0){
            d=temp%10;
            rev=rev*10 + d;
            temp=temp/10;
        }
        return (rev==n);
    }

    public static int counter(int n){
        int count=0;
        // time complexity O(d) where d is the number of digits
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
}
