package com.group1;

public class MenuItem {
    private String itemID;
    private double price;
    private int quantity;

    // Constructor
    public MenuItem(){}

    // Constructor for entering the item information
    public MenuItem(String itemID, double price, int quantity)
    {
        this.itemID = itemID;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter
    public String getItemID() {
        return itemID;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    // Setter
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    // display the main page(restaurant info and menu button)
    public void displayMainPage() {
        System.out.println("Main Page");
    }

    // display menu item
    public void displayMenu(){
        System.out.println("Menu");
    }
}
