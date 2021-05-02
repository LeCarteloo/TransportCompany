package main.java.entity;

public class PackagesExtended {

    private String packageNumber;
    private String timeOfPlannedDelivery;
    private String name;
    private String surname;
    private String phoneNumber;
    private String streetAndNumber;
    private String city;
    private String status;

    public PackagesExtended(String packageNumber, String timeOfPlannedDelivery, String name, String surname,
                            String phoneNumber, String streetAndNumber, String city, String status) {
        this.packageNumber = packageNumber;
        this.timeOfPlannedDelivery = timeOfPlannedDelivery;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.streetAndNumber = streetAndNumber;
        this.city = city;
        this.status = status;
    }

    public String getPackageNumber() {
        return packageNumber;
    }

    public String getTimeOfPlannedDelivery() {
        return timeOfPlannedDelivery;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStatus() {
        return status;
    }
}
