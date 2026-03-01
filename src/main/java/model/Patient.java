package model;

public class Patient {
    private int id;
    private String name;
    private String appReason;

    public Patient(int id, String name, String appReason) {
        this.id = id;
        this.name = name;
        this.appReason = appReason;
    }

    // accessors
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAppReason() {
        return appReason;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Reason: " + appReason;
    }
}
