package model;

public class Patient {
    private String name;
    private String lastName;
    private String address;
    private String city;
    private int zipCode;
    private String email;
    private String phoneNumber;
    private Double startWeight;
    private int dateOfBirth;

    Patient(String name, String lastName, String address, String city) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.startWeight = startWeight;
        this.dateOfBirth = dateOfBirth;

    }

    public Patient(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // public int getZipCode() {
    // return zipCode;
    // }

    // public void setZipCode(int zipCode) {
    // this.zipCode = zipCode;
    // }

    // public String getEmail() {
    // return email;
    // }

    // public void setEmail(String email) {
    // this.email = email;
    // }

    // public String getPhoneNumber() {
    // return phoneNumber;
    // }

    // public void setPhoneNumber(String phoneNumber) {
    // this.phoneNumber = phoneNumber;
    // }

    // public Double getStartWeight() {
    // return startWeight;
    // }

    // public void setStartWeight(Double startWeight) {
    // this.startWeight = startWeight;
    // }

    // public int getDateOfBirth() {
    // return dateOfBirth;
    // }

    // public void setDateOfBirth(int dateOfBirth) {
    // this.dateOfBirth = dateOfBirth;
    // }

    @Override
    public String toString() {
        return "Patient [name= " + name + ", lastName= " + lastName + ", address= " + address + ", city= " + city
                + "]";
    }

}
