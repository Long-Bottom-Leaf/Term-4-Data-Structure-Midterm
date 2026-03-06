package app;

import model.PatientRecord;
import services.PatientHistory;

import java.time.LocalDate;

public class PreloadPatientHistory {

    public static void preloadHistory(PatientHistory history) {

        history.addRecord(new PatientRecord(LocalDate.of(2026, 1, 1), "Flu", "Rest"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 2, 1), "Cold", "Medication"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 3, 1), "Injury", "Therapy"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 4, 1), "Allergy", "Antihistamines"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 5, 1), "Fracture", "Cast"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 6, 1), "Migraine", "Painkillers"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 7, 1), "Infection", "Antibiotics"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 8, 1), "Sprain", "Rest + Ice"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 9, 1), "Asthma", "Inhaler"));
        history.addRecord(new PatientRecord(LocalDate.of(2026, 10, 1), "Checkup", "Routine Exam"));

    }
}
