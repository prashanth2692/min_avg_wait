package com.prashanth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.nextLine());
        int noOfCustomers = scanner.nextInt();
        int[] customerEntryTime = new int[noOfCustomers];
        int[] customerOrderTime = new int[noOfCustomers];
        boolean[] orderStarted = new boolean[noOfCustomers];
//        List<Integer> customerEntryTime = new ArrayList<>();
        for (int i = 0; i < noOfCustomers; i++) {
            customerEntryTime[i] = scanner.nextInt();
            customerOrderTime[i] = scanner.nextInt();
        }

        int totalWaitTime = 0;
        int nextWaitTIme = Integer.MAX_VALUE;
        int currentWaitingTime = customerOrderTime[0];
        int tempIndex = -1;

        for (int i = 1; i < noOfCustomers - 1; i++) {
            int j = 1;
            while (j < noOfCustomers && customerEntryTime[j] < currentWaitingTime) {
                if (orderStarted[j] == false && nextWaitTIme > customerOrderTime[j]) {
                    nextWaitTIme = customerOrderTime[j];
                    tempIndex = j;
                }
                j++;
            }
            orderStarted[tempIndex] = true;
            System.out.println("current wait: " + currentWaitingTime);
            currentWaitingTime += nextWaitTIme;
            System.out.println("current wait: " + currentWaitingTime);
        }

        System.out.println(currentWaitingTime);
    }
}
