package com.naveen.nameList.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Person {

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String fatherName;
    private String motherName;
    private String place;
    private String dob;

    public Person(String name, String fatherName, String motherName, String place, String dob) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.place = place;
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
