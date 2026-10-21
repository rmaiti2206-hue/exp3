
//package com.electricity;

import java.util.Scanner;

public class App {

    public static double calculateBill(int units) {
        if (units < 0) {
            throw new IllegalArgumentException(
                "Units cannot be negative");
        }

        double bill = 0;

        // Sample slab rates for this practical
        if (units <= 100) {
            bill = units * 3.0;
        } else if (units <= 200) {
            bill = 100 * 3.0
                 + (units - 100) * 5.0;
        } else {
            bill = 100 * 3.0
                 + 100 * 5.0
                 + (units - 200) * 7.0;
        }

        return bill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        int units = scanner.nextInt();

        double bill = calculateBill(units);

        System.out.printf(
            "Total Electricity Bill: Rs. %.2f%n", bill);

        scanner.close();
    }
}
