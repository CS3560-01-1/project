package com.group1;

import java.util.Date;

public class Order {
    private String orderID;
    private Date orderDate;
    private double totalAmount;
    private String deliveryStatus;

    // Constructor
    public Order(){}

    // Constructor for entering the Order information
    public Order(String orderID, Date orderDate, double totalAmount, String deliveryStatus)
    {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.deliveryStatus = deliveryStatus;
    }

    // Getter
    public String getOrderID() {
        return orderID;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    // Setter
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    // lookup the specific order details by providing the orderID, return true if the orderID is valid
    public boolean lookUpDetail(String orderID){
        System.out.println("Order Details");
        return true;
    }

    // Print receipt
    public void printReceipt(){
        System.out.println("Receipt");
    }
}
