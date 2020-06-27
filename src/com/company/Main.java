package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 12 to determine quarter of year: ");
        if(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1: case 2: case 3:
                    System.out.println(num + " is on a first quarter.");
                    break;
                case 4: case 5: case 6:
                    System.out.println(num + " is on a second quarter.");
                    break;
                case 7: case 8: case 9:
                    System.out.println(num + " is on a third quarter.");
                    break;
                case 10: case 11: case 12:
                    System.out.println(num + "is on a fourth quarter");
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        } else {
            System.out.println("Invalid input!");
        }

    }
}
