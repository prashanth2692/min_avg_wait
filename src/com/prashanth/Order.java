package com.prashanth;

public class Order implements Comparable<Order> {
    int orderTime;
    int waitTime;
    boolean orderStarted;

    public Order(int orderTime, int waitTime) {
        this.orderTime = orderTime;
        this.waitTime = waitTime;
        this.orderStarted = false;
    }

    public int compareTo(Order order) {
        if (this.orderTime > order.orderTime) {
            return 1;
        } else {
            return 0;
        }
    }
}
