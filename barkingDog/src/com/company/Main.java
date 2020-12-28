package com.company;

public class Main {

    public static void main(String[] args) {
        shouldWakeUp(true, -1);
    }


    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("false");
        } else if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}









