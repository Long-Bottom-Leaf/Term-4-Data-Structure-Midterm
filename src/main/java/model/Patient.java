package model;

public class Patient {
    private int id;
    private String name;
    private String reasonForVisit;

    public Patient(int id, String name, String appReason) {
        this.id = id;
        this.name = name;
        this.reasonForVisit = appReason;
    }

    // accessors
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Reason: " + reasonForVisit;
    }
}
