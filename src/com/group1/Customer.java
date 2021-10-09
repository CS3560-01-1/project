package com.group1;

public class Customer {
    private String accountID;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String creditCardNumber;
    private String creditCardExp;
    private int creditCardCvv;

    // Constructor
    public Customer(){}

    // Constructor for entering the customer information
    public Customer(String accountID, String name, String address, String email, String phoneNumber,
                    String creditCardNumber, String creditCardExp, int creditCardCvv)
    {
        this.accountID = accountID;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExp = creditCardExp;
        this.creditCardCvv = creditCardCvv;
    }

    // Getter
    public String getAccountID() {
        return accountID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getCreditCardNumber() {
        return creditCardNumber;
    }
    public String getCreditCardExp() {
        return creditCardExp;
    }
    public int getCreditCardCvv() {
        return creditCardCvv;
    }

    // Setter
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    public void setCreditCardExp(String creditCardExp) {
        this.creditCardExp = creditCardExp;
    }
    public void setCreditCardCvv(int creditCardCvv) {
        this.creditCardCvv = creditCardCvv;
    }

    // Customer signUp (Return true if all the information is valid)
    public boolean signUp(){
        return true;
    }

    // Customer sign in (Return true if the username and password correct)
    public boolean signIn(){
        return true;
    }

    // Customer add one item(represent by itemID) to cart, return true if the item is available and can be added to cart
    public boolean addToCart(int itemID){
        return true;
    }

    // Customer check out, return the total price
    public double placeOrder(){
        return 0;
    }

    // Customer rate restaurant by providing the service code(1 ~ 5), return true if the service code is valid
    public boolean rateRestaurant(int serviceCode){
        return true;
    }
}