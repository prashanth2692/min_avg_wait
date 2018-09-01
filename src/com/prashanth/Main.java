package com.prashanth;

import java.util.Scanner;

public class Main {

    private int[] customerEntryTime;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfCustomers = scanner.nextInt();
        int[] customerEntryTime = new int[noOfCustomers]; // array of order entry time for ith customer
        int[] customerOrderTime = new int[noOfCustomers]; // array of order waiting time of ith customer
        boolean[] orderStarted = new boolean[noOfCustomers]; // maintains if ith order is completed

        // read customer data
        for (int i = 0; i < noOfCustomers; i++) {
            customerEntryTime[i] = scanner.nextInt();
            customerOrderTime[i] = scanner.nextInt();
        }

        int totalWaitTime = 0; //customerOrderTime[0];
        int currentWaitingTime = 0; //customerOrderTime[0]; //
        int tempIndex = -1;

        for (int i = 0; i < noOfCustomers; i++) {
            int nextWaitTIme = Integer.MAX_VALUE; // stores the order which will e taken up next

            int j = 0;
            while (j < noOfCustomers && customerEntryTime[j] <= currentWaitingTime) {
                // verify all the customers who has placed order within current waiting time.
                // pick the least time taking order
                if (orderStarted[j] == false && nextWaitTIme > customerOrderTime[j]) {
                    nextWaitTIme = customerOrderTime[j];
                    tempIndex = j;
                }
                j++;
            }

            // set the selected order as completed
            orderStarted[tempIndex] = true;
            currentWaitingTime += nextWaitTIme;
            totalWaitTime = totalWaitTime + currentWaitingTime - customerEntryTime[tempIndex];

//            System.out.println("next time: " + nextWaitTIme);
//            System.out.println("wait time: " + nextWaitTIme + (totalWaitTime - customerEntryTime[tempIndex]));
//            System.out.println(totalWaitTime);
        }
//        System.out.println(currentWaitingTime);
        System.out.println(totalWaitTime/noOfCustomers);
    }
}
