package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int totNumQuan = 0;
        int i = 1;
        while (i <= 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number " + i );
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int numQuan = scanner.nextInt();
                totNumQuan = totNumQuan + numQuan;
                i++;
            } else {
                System.out.println("Not a number");
            }
        }
        System.out.println("Sum is " + totNumQuan);

    }
}
