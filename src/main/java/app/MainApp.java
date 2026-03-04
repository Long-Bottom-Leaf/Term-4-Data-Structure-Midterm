package app;

import java.util.Scanner;
import services.WaitingRoom;
import services.PatientHistory;
import model.Patient;
import model.PatientRecord;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WaitingRoom waitingRoom = new WaitingRoom();
        PatientHistory patientHistory = new PatientHistory();

        preloadPatients(waitingRoom);
        preloadHistory(patientHistory);

        int choice;

        do {

        } while (choice != 5);

        scanner.close();
    }
}

// preload patients
private static void preloadPatients(WaitingRoom waitingRoom) {

    waitingRoom.addPatient(new Patient(1, "Alice", "Flu"));
    waitingRoom.addPatient(new Patient(2, "Billy", "Stomach Pain"));
    waitingRoom.addPatient(new Patient(3, "Charlie", "Headache"));
    waitingRoom.addPatient(new Patient(4, "Diana", "Back Pain"));
    waitingRoom.addPatient(new Patient(5, "Ethan", "Fever"));
    waitingRoom.addPatient(new Patient(6, "Fiona", "Infection"));
    waitingRoom.addPatient(new Patient(7, "George", "Sprain"));
    waitingRoom.addPatient(new Patient(8, "Hannah", "Allergy"));
    waitingRoom.addPatient(new Patient(9, "Ian", "Migraine"));
    waitingRoom.addPatient(new Patient(10, "Julia", "Cold"));
}

// preload patient history
private static void preloadHistory(PatientHistory history) {

    history.addRecord(new PatientRecord("2026-01-01", "Flu", "Rest"));
    history.addRecord(new PatientRecord("2026-02-01", "Cold", "Medication"));
    history.addRecord(new PatientRecord("2026-03-01", "Injury", "Therapy"));
    history.addRecord(new PatientRecord("2026-04-01", "Allergy", "Antihistamines"));
    history.addRecord(new PatientRecord("2026-05-01", "Fracture", "Cast"));
    history.addRecord(new PatientRecord("2026-06-01", "Migraine", "Painkillers"));
    history.addRecord(new PatientRecord("2026-07-01", "Infection", "Antibiotics"));
    history.addRecord(new PatientRecord("2026-08-01", "Sprain", "Rest + Ice"));
    history.addRecord(new PatientRecord("2026-09-01", "Asthma", "Inhaler"));
    history.addRecord(new PatientRecord("2026-10-01", "Checkup", "Routine Exam"));
}