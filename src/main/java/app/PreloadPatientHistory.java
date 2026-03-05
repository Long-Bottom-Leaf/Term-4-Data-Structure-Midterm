package app;

import model.PatientRecord;
import services.PatientHistory;

public class PreloadPatientHistory {

    public static void preloadHistory(PatientHistory history) {

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
}
