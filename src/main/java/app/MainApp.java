package app;

import java.util.Scanner;
import services.WaitingRoom;
import services.PatientHistory;
import model.Patient;
import model.PatientRecord;

import static app.NavigateHistory.navigateHistory;
import static app.PreloadPatientHistory.preloadHistory;
import static app.PreloadPatients.preloadPatients;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WaitingRoom waitingRoom = new WaitingRoom();
        PatientHistory patientHistory = new PatientHistory();

        preloadPatients(waitingRoom);
        preloadHistory(patientHistory);

        int choice;

        do {
            System.out.println("\n======= PATIENT MANAGEMENT SYSTEM =======");
            System.out.println("1. View Waiting Room");
            System.out.println("2. Serve Next Patient");
            System.out.println("3. Add Emergency Patient");
            System.out.println("4. View Patient History");
            System.out.println("5. Search patient by ID");
            System.out.println("6. Check next patient in queue");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (Patient patient : waitingRoom.getAllPatients()) {
                        System.out.println(patient);
                    }

                    break;

                case 2:
                    Patient served = waitingRoom.serveNextPatient();
                    if (served != null) {
                        System.out.println("Serving: " + served);
                    } else {
                        System.out.println("No patients waiting.");
                    }

                    break;

                case 3:
                    WaitingRoomMenu.handleEmergencyInsertion(scanner, waitingRoom);

                    break;

                case 4:
                    navigateHistory(scanner, patientHistory);

                    break;

                case 5:
                    System.out.println("Enter patient ID: ");
                    int searchId = scanner.nextInt();

                    Patient found = waitingRoom.findPatientById(searchId);

                    if (found != null) {
                        System.out.println("Patient: " + found);

                    } else {
                        System.out.println("Patient not found!");
                    }

                    break;

                case 6:
                    System.out.println("Next patient: " + waitingRoom.checkNextPatient());

                    break;

                case 7:
                    System.out.println("Exiting program...");

                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 7);

        scanner.close();
    }
}