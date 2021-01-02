package com.company;

public class Main {

    public static void main(String[] args) {

        bankAccount Marc = new bankAccount( 12345, 100, "Marc Bergman",
                "mgbergman@gmail.com", 5551212);
        System.out.println("HEllo");



        Marc.depositFunds(100);
        Marc.withdrawFunds(50);



    }
}
