package app;

import services.WaitingRoom;
import model.Patient;

import java.util.Scanner;

public class SearchById {

    public static void searchPatientById(Scanner scanner, WaitingRoom waitingRoom) {
        System.out.println("Enter patient ID: ");
        int searchId;

        try {
            searchId = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Invalid ID.");
            scanner.nextLine();

            return;
        }

        scanner.nextLine();

        Patient found = waitingRoom.findPatientById(searchId);

        if (found != null) {
            System.out.println("Patient: " + found);

        } else {
            System.out.println("Patient not found!");
        }
    }
}