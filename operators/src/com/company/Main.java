package com.company;

public class Main {

    public static void main(String[] args) {
        Double varOne = 20.00;
        Double varTwo = 80.00;
        Double varThree = (varOne + varTwo) * 100;
        int varFour = (int) (varThree % 40);
        boolean remainder;
        if (varFour == 0) {
            remainder = true;
        } else {
            remainder = false;
        }

        System.out.println(remainder);


    }
}
