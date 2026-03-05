package app;

import model.Patient;
import services.WaitingRoom;

public class PreloadPatients {

    public static void preloadPatients(WaitingRoom waitingRoom) {

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
}
