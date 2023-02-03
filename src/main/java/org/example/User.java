package org.example;

public class User {

    int id;
    String name;
    String drivingLicense;

    public User(int id, String name, String drivingLicense) {
        this.id = id;
        this.name = name;
        this.drivingLicense = drivingLicense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
