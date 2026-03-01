package model;

public class PatientRecord {
    private String visitDate;
    private String diagnosis;
    private String treatmentNotes;

    public void patientRecord(String visitDate, String diagnosis, String treatmentNotes) {
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.treatmentNotes = treatmentNotes;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatmentNotes(String treatmentNotes) {
        this.treatmentNotes = treatmentNotes;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatmentNotes() {
        return treatmentNotes;
    }
}
