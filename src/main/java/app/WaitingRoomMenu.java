package app;

import services.WaitingRoom;
import model.Patient;

import java.util.Scanner;

public class WaitingRoomMenu {

    public static void handleEmergencyInsertion(Scanner scanner, WaitingRoom waitingRoom) {

        try {
            System.out.print("Enter position for emergency insertion: ");
            int position = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Condition: ");
            String condition = scanner.nextLine();

            Patient emergency = new Patient(id, name, condition);

            boolean inserted = waitingRoom.insertEmergencyPatient(position, emergency);

            if (inserted) {
                System.out.println("Emergency patient inserted.");
            } else {
                System.out.println("Invalid position or duplicate ID.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values where required.");
            scanner.nextLine(); // clear invalid input
        }
    }
}