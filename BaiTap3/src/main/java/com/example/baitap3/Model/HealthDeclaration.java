package com.example.baitap3.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HealthDeclaration {
    private String fullName;
    private int birthYear;
    private String gender;
    private String nationality;
    private String idNumber;

    private String transportType;
    private String vehicleNumber;
    private String seatNumber;
    private String startDate;
    private String endDate;
    private String recentPlaces;

    private String province;
    private String district;
    private String ward;
    private String address;
    private String phone;
    private String email;

    private boolean hasFever;
    private boolean hasCough;
    private boolean hasShortnessOfBreath;
    private boolean hasSoreThroat;
    private boolean hasNausea;
    private boolean hasDiarrhea;
    private boolean hasSkinRash;
    private boolean hasHemorrhage;

    private boolean contactedAnimals;
    private boolean contactedCovid;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRecentPlaces() {
        return recentPlaces;
    }

    public void setRecentPlaces(String recentPlaces) {
        this.recentPlaces = recentPlaces;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasFever() {
        return hasFever;
    }

    public void setHasFever(boolean hasFever) {
        this.hasFever = hasFever;
    }

    public boolean isHasCough() {
        return hasCough;
    }

    public void setHasCough(boolean hasCough) {
        this.hasCough = hasCough;
    }

    public boolean isHasShortnessOfBreath() {
        return hasShortnessOfBreath;
    }

    public void setHasShortnessOfBreath(boolean hasShortnessOfBreath) {
        this.hasShortnessOfBreath = hasShortnessOfBreath;
    }

    public boolean isHasSoreThroat() {
        return hasSoreThroat;
    }

    public void setHasSoreThroat(boolean hasSoreThroat) {
        this.hasSoreThroat = hasSoreThroat;
    }

    public boolean isHasNausea() {
        return hasNausea;
    }

    public void setHasNausea(boolean hasNausea) {
        this.hasNausea = hasNausea;
    }

    public boolean isHasDiarrhea() {
        return hasDiarrhea;
    }

    public void setHasDiarrhea(boolean hasDiarrhea) {
        this.hasDiarrhea = hasDiarrhea;
    }

    public boolean isHasSkinRash() {
        return hasSkinRash;
    }

    public void setHasSkinRash(boolean hasSkinRash) {
        this.hasSkinRash = hasSkinRash;
    }

    public boolean isHasHemorrhage() {
        return hasHemorrhage;
    }

    public void setHasHemorrhage(boolean hasHemorrhage) {
        this.hasHemorrhage = hasHemorrhage;
    }

    public boolean isContactedAnimals() {
        return contactedAnimals;
    }

    public void setContactedAnimals(boolean contactedAnimals) {
        this.contactedAnimals = contactedAnimals;
    }

    public boolean isContactedCovid() {
        return contactedCovid;
    }

    public void setContactedCovid(boolean contactedCovid) {
        this.contactedCovid = contactedCovid;
    }
}
