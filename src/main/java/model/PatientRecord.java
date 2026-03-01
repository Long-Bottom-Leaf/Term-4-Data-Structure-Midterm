package model;

public class PatientRecord {
    private String visitDate;
    private String diagnosis;
    private String treatmentNotes;

    public PatientRecord(String visitDate, String diagnosis, String treatmentNotes) {
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.treatmentNotes = treatmentNotes;
    }

    // accessors
    public String getVisitDate() {
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
