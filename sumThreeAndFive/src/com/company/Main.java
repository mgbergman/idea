package com.company;

public class Main {

    public static void main(String[] args) {
	    int sumNumber = 0;
	    int quanNumber = 0;
        for (int i=1; i<1001; i++) {
	    if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i);
            sumNumber = sumNumber + i;
            quanNumber = quanNumber + 1;
        }
	    if (quanNumber == 5) {
            System.out.println(sumNumber);
            break;
        }

    }
    }
}
