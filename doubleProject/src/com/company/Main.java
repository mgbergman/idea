package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000, 2));

        for(int i=8; i>1; i--) {
            System.out.println(calculateInterest(10000, i));
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
