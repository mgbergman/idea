package com.company;

public class bankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private int phoneNumber;

    public bankAccount(int accountNumber, double balance, String customerName, String eMail, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public bankAccount() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String geteMail() {
        return eMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
    }
    public void withdrawFunds(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            this.balance -= withdrawAmount;
            System.out.println(withdrawAmount + " Balance= " + balance);
        } else {
            System.out.println("Insufficient amount");
        }
    }
}
