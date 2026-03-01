package model;

public class Patient {
    int id;
    String name;
    String appReason;

    public void Patient(int id, String name, String appReason) {
        this.id = id;
        this.name = name;
        this.appReason = appReason;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppReason(String appReason) {
        this.appReason = appReason;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAppReason() {
        return appReason;
    }
}
