package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int number= input.nextInt();
        for (int i = 3; i <number ; i++) {
            if (isprime(i)){
                System.out.print(i+"  ");
            }
        }
    }
public static boolean isprime(int x){
    for (int i = 2; i <x ; i++) {
        if (x%i==0)
            return false;
    }
return true;
    }

}