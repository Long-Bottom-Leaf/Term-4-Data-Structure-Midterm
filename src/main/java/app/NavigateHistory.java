package app;

import services.PatientHistory;

import java.util.Scanner;

public class NavigateHistory {

    public static void navigateHistory(Scanner scanner, PatientHistory history) {

        history.getOldest();

        int choice;

        do {
            System.out.println("\n--- Patient History Navigation ---");
            System.out.println("Current Record: " + history.getCurrent());
            System.out.println("1. Next Record");
            System.out.println("2. Previous Record");
            System.out.println("3. Exit History View");
            System.out.print("Choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (history.nextRecord() == null) {
                        System.out.println("No newer records.");
                    }
                    break;

                case 2:
                    if (history.previousRecord() == null) {
                        System.out.println("No older records.");
                    }
                    break;
            }

        } while (choice != 3);
    }

}
