package com.prashanth;

import java.util.Scanner;

public class MAin1 {
    //    public static Order getFirst()
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfCustomers = scanner.nextInt();

//        int[] customerEntryTime = new int[noOfCustomers]; // array of order entry time for ith customer
//        int[] customerOrderTime = new int[noOfCustomers]; // array of order waiting time of ith customer
        Order[] orders = new Order[noOfCustomers];

        for (int i = 0; i < noOfCustomers; i++) {
//            customerEntryTime[i] = scanner.nextInt();
//            customerOrderTime[i] = scanner.nextInt();
            orders[i] = new Order(scanner.nextInt(), scanner.nextInt());
        }

        int nextWaitTIme = Integer.MAX_VALUE; // stores the order which will e taken up next
//        int currentWaitingTime = customerOrderTime[0]; //
//        int tempIndex = -1;
//
//        for (int i = 1; i < noOfCustomers - 1; i++) {
//            int j = 1;
//            while (j < noOfCustomers && customerEntryTime[j] < currentWaitingTime) {
//                // verify all the customers who has placed order within current waiting time.
//                // pick the least time taking order
//                if (orderStarted[j] == false && nextWaitTIme > customerOrderTime[j]) {
//                    nextWaitTIme = customerOrderTime[j];
//                    tempIndex = j;
//                }
//                j++;
//            }
//
//            // set the selected order as completed
//            orderStarted[tempIndex] = true;
//            currentWaitingTime += nextWaitTIme;
//        }
//
//        System.out.println(currentWaitingTime);
    }
}
