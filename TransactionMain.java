package com.greatlearning.driver;

import java.util.Scanner;


public class TransactionMain {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the size of transaction array");
        TransactionServiceImpl transactionServiceImpl = new TransactionServiceImpl();
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("enter the values of array");

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("enter the total no of targets that needs to be achieved");
        int targetNo = s.nextInt();


        while (targetNo--!= 0) {
            long target;
            System.out.println("enter the value of target");
            target = s.nextLong();
            transactionServiceImpl.search(arr,target);
            targetNo--;
        }
    }
}
