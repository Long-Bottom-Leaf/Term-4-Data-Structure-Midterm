package model;

import java.time.LocalDate;

public class PatientRecord {
    private LocalDate visitDate;
    private String diagnosis;
    private String treatmentNotes;

    public PatientRecord(LocalDate visitDate, String diagnosis, String treatmentNotes) {
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.treatmentNotes = treatmentNotes;
    }

    // accessors
    public LocalDate getVisitDate() {
        return visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatmentNotes() {
        return treatmentNotes;
    }

    @Override
    public String toString() {
        return "Date: " + visitDate + ", Diagnosis: " + diagnosis + ", Notes: " + treatmentNotes;
    }
}
