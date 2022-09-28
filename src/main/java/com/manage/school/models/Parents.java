package com.manage.school.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Parents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String MotherName;
    private String FatherName;
    private String Address;
    private String TelePhone;

    public Parents(String motherName, String fatherName, String address, String TelePhone) {
        MotherName = motherName;
        FatherName = fatherName;
        Address = address;
        this.TelePhone = TelePhone;
    }

    public Parents() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String motherName) {
        MotherName = motherName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTelePhone() {
        return TelePhone;
    }

    public void setTelePhone(String TelePhone) {
        this.TelePhone = TelePhone;
    }



}
