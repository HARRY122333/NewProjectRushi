package com.tcs;

import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag = false;
        int no=sc.nextInt();
        System.out.println("calling function...");
        System.out.println(isPrime(no));
    }

    static int isPrime(long no){
        for (int i = 2; i <= no/2; i++) {
            if (no % i == 0) {
                //System.out.println(i);
                //flag=true;
                //break;
                return i;
            }
        }
        return 1;
        //if(flag != true){
        //    System.out.println(1);
        //}
    }

}
}
