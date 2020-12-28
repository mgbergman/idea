package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(-1, 6);


    }

    public static void calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches <= 0 || inches >= 12) {
            double cent = -1;
            System.out.println(cent);
        } else {
            double cent = (feet * 12 + inches) * 2.54;
            System.out.println(cent);
        }

    }
}


