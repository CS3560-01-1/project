package com.group1;

public class MenuItem {
    private String foodItemID;
    private String drinkItemID;
    private double price;
    private int quantity;

    // Getter
    public String getFoodItemID() {
        return foodItemID;
    }
    public String getDrinkItemID(){
        return drinkItemID;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    // Setter
    public void setFoodItemID(String foodItemID) {
        this.foodItemID = foodItemID;
    }
    public void setDrinkItemID(String drinkItemID){
        this.drinkItemID = drinkItemID;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    // display the main page(restaurant info and menu button)
    public void displayMainPage() {
        ;
    }

    // display menu item
    public void displayMenu(){
        ;
    }
}
