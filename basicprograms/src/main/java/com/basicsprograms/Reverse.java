package com.basicsprograms;

public class Reverse {
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;
        while(n!=0){
            r = n%10; ----->r = 4,3,2,1
            rev = rev*10+r;---->rev =43*10+2= 430+2=432; 432*10+1=4321;
            n = n/10;----> n = 123-->n/10 = 123/10= 12 ;n/10= 12/10 =1
        }
        System.out.println("rev");
    }
}
