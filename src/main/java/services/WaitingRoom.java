package services;

import model.Patient;
import java.util.LinkedList;
import java.util.List;

public class WaitingRoom {

    private LinkedList<Patient> queue;

    public WaitingRoom() {
        queue = new LinkedList<>();
    }

    // add patient to end (normal arrival)
        public void addPatient(Patient patient) {
            queue.addLast(patient);
        }

    // serve next patient (FIFO)
        public Patient serveNextPatient() {
            if (queue.isEmpty()) {
                return null;
            }

            return queue.removeFirst();
        }

    // emergency insertion
        public boolean insertEmergencyPatient(int position, Patient patient) {
            if (position < 0 || position > queue.size()) {
                return false;
            }

            queue.add(position, patient);
            return true;
        }

    // find patient by ID
        public Patient findPatientById(int id) {
            for (Patient patient : patients) {
                if (patient.getId() == id) {
                    return patient;
                }
            }

            return null;
        }

    // return all patients - read only
        public List<Patient> getAllPatients() {
            return new LinkedList<>(queue);
        }

    // check if list is empty
        public boolean isEmpty() {
            return queue.isEmpty();
        }

    // check size for testing
        public int size() {
            return queue.size();
        }
}
