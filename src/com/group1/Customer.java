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

    // signUp (Return true if all the information is valid)
    public boolean signUp(){
        return true;
    }

    // sign in (Return true if the username and password correct)
    public boolean signIn(){
        return true;
    }
}