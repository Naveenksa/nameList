package com.naveen.nameList.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Entity
@NoArgsConstructor
@Getter
public class Adhaar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pinCode;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    public Adhaar(Long pinCode, Person person) {
        this.pinCode = pinCode;
        this.person = person;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}
