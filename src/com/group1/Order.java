package com.group1;

import java.util.Date;

public class Order {
    private String orderID;
    private Date orderDate;
    //private double totalAmount;
    private String deliveryStatus;

    // Getter
    public String getOrderID() {
        return orderID;
    }
    public Date getOrderDate() {
        return orderDate;
    }
//    public double getTotalAmount() {
//        return totalAmount;
//    }
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
//    public void setTotalAmount(double totalAmount) {
//        this.totalAmount = totalAmount;
//    }
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    // Customer adds the item to the cart. then it will return the subtotal of all items added to cart
    public double addToCart(String item){
        double subTotal = 0;
        return subTotal;
    }


    // Customer check out, return the total price
    public double placeOrder(){
        double totalPrice = 0;
        return totalPrice;
    }

    // Print receipt
    public void printReceipt(){
        ;
    }


}
